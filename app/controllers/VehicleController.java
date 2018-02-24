package controllers;

import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import models.*;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import views.html.*;

public class VehicleController extends Controller {

	@Inject
	FormFactory formfactory;

	// for all vehicles
	public Result index(){
		List<Vehicle> vehicles = Vehicle.find.all();
		return ok(vehicleindex.render(vehicles));
	}

	//to create vehicle
	public Result create(){
		Form<Vehicle> vehicleform = formfactory.form(Vehicle.class);
		return ok(vehiclecreate.render(vehicleform));
	}

	//to save vehicle
	public Result save(){
		Form<Vehicle> vehicleform = formfactory.form(Vehicle.class).bindFromRequest();
		Integer driverId = Integer.valueOf(session().get("driverId"));
		Vehicle vehicle = vehicleform.get();
		Driver driver = Driver.find.byId(driverId);
		vehicle.driver = driver;
		vehicle.save();
		return redirect(routes.DriverController.show(driverId));
	}

	//to show vehicle
		public Result show(Integer id){
			Vehicle vehicle = Vehicle.find.byId(id);
			if(vehicle == null){
				return notFound("Vehicle Not Found");
			}

			return ok(vehicleshow.render(vehicle));
		}

	//to delete vehicle
	public Result destroy(Integer id){
		Vehicle vehicle = Vehicle.find.byId(id);
		if(vehicle == null){
			return notFound("Vehicle Not Found");
		}
		vehicle.delete();
		return redirect(routes.VehicleController.index());
	}
}