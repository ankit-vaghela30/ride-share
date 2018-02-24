package controllers;

import java.util.ArrayList;
import play.api.Logger;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import models.*;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import views.html.*;

public class RideController extends Controller {

	@Inject
	FormFactory formfactory;

	// for all students
	public Result index(){
		List<Ride> ride = Ride.find.all();
		return ok(rideindex.render(ride));
	}

	//to create student
	public Result create(){
		Form<Ride> rideform = formfactory.form(Ride.class);
		Integer driverId = Integer.valueOf(session().get("driverId"));
		Driver driver = Driver.find.byId(driverId);
		return ok(ridecreate.render(rideform, driver));
	}

	//to save student
	public Result save(){
		Form<Ride> rideform = formfactory.form(Ride.class).bindFromRequest();
		Integer driverId = Integer.valueOf(session().get("driverId"));
		Ride ride = rideform.get();
		Driver driver = Driver.find.byId(driverId);
		ride.driverRide = driver;
		ride.save();
		return redirect(routes.DriverController.show(driverId));
	}

	//to show student
		public Result show(Integer id){
			Ride ride = Ride.find.byId(id);
			if(ride == null){
				return notFound("Ride Not Found");
			}

			return ok(rideshow.render(ride));
		}

	//to delete student
	public Result destroy(Integer id){
		Ride ride = Ride.find.byId(id);
		if(ride == null){
			return notFound("Ride Not Found");
		}
		ride.delete();
		return redirect(routes.RideController.index());
	}

	public Result search(){
		Form<Ride> searchrideform = formfactory.form(Ride.class);
		return ok(ridesearch.render(searchrideform));
	}

	public Result searchRides(){

		Form<Ride> searchrideform = formfactory.form(Ride.class).bindFromRequest();

		Ride ride = searchrideform.get();
		List<Ride> rides = Ride.find.all();


		//ogger.error("Attempting risky calculation.");


		List<Ride> ridesToShow = new ArrayList<Ride>();

		for(Ride r : rides){

			int totalCapacity = r.vehicle.capacity;
			//Logger.debug("total capacity is: "+ totalCapacity.toString());

			if((r.startTime.compareTo(new Date()) > 0) && r.source.equalsIgnoreCase(ride.source) && r.destination.equalsIgnoreCase(ride.destination))
			{
				int currentCapacity = r.ridesRiderList.size();

				//Logger.debug("current capacity is: ");
				if(currentCapacity < totalCapacity)
				{
					ridesToShow.add(r);
				}

				//ridesToShow.add(r);
			}
		}
		return ok(ridesearchresult.render(ridesToShow));
	}
	public Result register(Integer id){
		Ride ride = Ride.find.byId(id);

		Integer riderId = Integer.valueOf(session().get("riderId"));

		Rider rider = Rider.find.byId(riderId);

		Rating rating = new Rating();
		rating.rideIdAssoc = ride;
		rating.riderIdAssoc = rider;

		rating.save();

		return redirect(routes.RiderController.show(riderId));
	}

	public Result rate(Integer id){
		Ride ride = Ride.find.byId(id);
		Form<Ride> rideform = formfactory.form(Ride.class);
		Form<Rating> ratingform = formfactory.form(Rating.class);

		session("rideId",ride.rideId.toString());

		if(ride == null){
			return notFound("Ride Not Found");
		}

		return ok(rideshowforrating.render(ride, rideform, ratingform));
	}

	public Result saveRide(){
		Form<Rating> ratingform = formfactory.form(Rating.class).bindFromRequest();
		Rating rating = ratingform.get();

		Integer rideId = Integer.valueOf(session().get("rideId"));

		 Ride rideToSave = Ride.find.byId(rideId);

		

		System.out.println("Rating feedback"+rating.feedback);

		Integer riderId = Integer.valueOf(session().get("riderId"));

		Rider rider = Rider.find.byId(riderId);

		Rating ratingToSave = Rating.find.where().eq("ride_id_assoc_ride_id",rideToSave.rideId).eq("rider_id_assoc_rider_id",rider.riderId).findUnique();
		ratingToSave.rating = rating.rating;
		ratingToSave.feedback = rating.feedback;
		System.out.println(ratingToSave);
		ratingToSave.update();
		
		return redirect(routes.RiderController.show(riderId));
	}

}
