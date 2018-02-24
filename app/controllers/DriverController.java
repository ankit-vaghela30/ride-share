package controllers;

import java.util.List;
import org.mindrot.jbcrypt.BCrypt;
import java.util.Set;

import javax.inject.Inject;

import models.*;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import views.html.*;

public class DriverController extends Controller {

	@Inject
	FormFactory formfactory;

	// for all drivers
	public Result index(){
		List<Driver> drivers = Driver.find.all();
		return ok(driverindex.render(drivers));
	}

	//to create driver
	public Result create(){
		Form<Driver> driverform = formfactory.form(Driver.class);
		return ok(drivercreate.render(driverform));
	}

	//to save driver
	public Result save(){
		Form<Driver> driverform = formfactory.form(Driver.class).bindFromRequest();
		Driver driver = driverform.get();	
		driver.password = BCrypt.hashpw(driver.password, BCrypt.gensalt());
		driver.save();
		return redirect(routes.DriverController.login());
	}

	//to show driver
		public Result show(Integer id){
			Driver driver = Driver.find.byId(id);
			session("driverId",driver.driverId.toString());
			if(driver == null){
				return notFound("Driver Not Found");
			}

			return ok(drivershow.render(driver));
		}

	//to delete driver
	public Result destroy(Integer id){
		Driver driver = Driver.find.byId(id);
		if(driver == null){
			return notFound("Driver Not Found");
		}
		driver.delete();
		return redirect(routes.DriverController.index());
	}
	
	//Login for Driver
		public Result login(){
			Form<Driver> driverform = formfactory.form(Driver.class);
			return ok(logindriver.render(driverform));
		}
	
	//to validate the driver
	public Result validate(){
		Form<Driver> driverform = formfactory.form(Driver.class).bindFromRequest();
		Driver driver = driverform.get();	
		//driver.password = BCrypt.hashpw(driver.password, BCrypt.gensalt());
		Driver driverfound = Driver.find.where().eq("email", driver.email).findUnique();
		
	
		
		if((driverfound != null) && BCrypt.checkpw(driver.password, driverfound.password)){		
		return redirect(routes.DriverController.show(driverfound.driverId));
		}
		else
		{
			return redirect(routes.DriverController.login());
		}
	}
	
}
