package models;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Id;

import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Finder;
import java.util.*;

@Entity
public class Driver extends Model {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer driverId;
	@Column(nullable = false)
	public String firstName;
	@Column(nullable = false)
	public String lastName;
	@Column(nullable = false)
	public char gender;
	@Column(nullable = false)
	public String driverLicense;
	@Column(nullable = false)
	public String password;
	@Column(nullable = false)
	public String email;
	@Column(nullable = false)
	public String phoneNumber;
	
	@OneToMany(mappedBy = "driver", cascade = CascadeType.ALL)
	public List<Vehicle> vehicles;
	
	@OneToMany(mappedBy = "driverRide", cascade = CascadeType.ALL)
	public List<Ride> rides;
	
	public static Finder<Integer, Driver> find = new Finder<Integer, Driver>(Driver.class);
	
	public Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Vehicle v: vehicles) {
            options.put(v.vehicleId.toString(), v.vehicleName);
        }
        return options;
    }

	

}
