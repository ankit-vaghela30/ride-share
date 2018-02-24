package controllers;

import java.util.*;
import org.mindrot.jbcrypt.BCrypt;
import java.util.Set;

import javax.inject.Inject;

import models.*;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import views.html.*;

public class RiderController extends Controller {

	@Inject
	FormFactory formfactory;

	// for all students
	public Result index(){
		List<Rider> riders = Rider.find.all();
		return ok(riderindex.render(riders));
	}

	//to create student
	public Result create(){
		Form<Rider> riderform = formfactory.form(Rider.class);
		return ok(ridercreate.render(riderform));
	}

	//to save student
	public Result save(){
		Form<Rider> riderform = formfactory.form(Rider.class).bindFromRequest();
		Rider rider = riderform.get();
		rider.password = BCrypt.hashpw(rider.password, BCrypt.gensalt());
		rider.save();
		return redirect(routes.RiderController.login());
	}

	//to show student
		public Result show(Integer id){
			Rider rider = Rider.find.byId(id);
			session("riderId",rider.riderId.toString());
			if(rider == null){
				return notFound("Rider Not Found");
			}

			return ok(ridershow.render(rider));
		}

	//to delete student
	public Result destroy(Integer id){
		Rider rider = Rider.find.byId(id);
		if(rider == null){
			return notFound("Rider Not Found");
		}
		rider.delete();
		return redirect(routes.RiderController.index());
	}

	//to login rider
	public Result login(){
		Form<Rider> riderform = formfactory.form(Rider.class);
		return ok(loginrider.render(riderform));
	}

//to validate the rider
	public Result validate(){
		Form<Rider> riderform = formfactory.form(Rider.class).bindFromRequest();
		Rider rider = riderform.get();
		//driver.password = BCrypt.hashpw(driver.password, BCrypt.gensalt());
		Rider riderfound = Rider.find.where().eq("email", rider.email).findUnique();
		if((riderfound != null) && BCrypt.checkpw(rider.password, riderfound.password)){

			//TO BE CHANGED!
			return redirect(routes.RiderController.show(riderfound.riderId));
		}
		else
		{
			return redirect(routes.RiderController.login());
		}
	}

	public Result showRides(Integer id){



		Rider rider = Rider.find.byId(id);

		List<Rating> ridesOfRider = rider.riderRidesList;
		List<Ride> ridesToShow = new ArrayList<Ride>();

		for(Rating r : ridesOfRider){
			Ride ride = Ride.find.byId(r.rideIdAssoc.rideId);
			ridesToShow.add(ride);
		}

		return ok(ridesofridersearchresult.render(ridesToShow));
	}

}
