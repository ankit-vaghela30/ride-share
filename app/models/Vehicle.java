package models;

import javax.persistence.*;

import java.util.List;

import javax.inject.Named;
import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Finder;

@Entity
public class Vehicle extends Model {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer vehicleId;
	@Column(nullable = false)
	public int capacity;
	@Column(nullable = false)
	public String vehicleName;
	@Column(nullable = false)
	public String vehicleType;
	
	@OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL)
	public List<Ride> rides;
	
	@ManyToOne(cascade = CascadeType.REMOVE, optional = false)
	public Driver driver;
	
	public static Finder<Integer, Vehicle> find = new Finder<Integer, Vehicle>(Vehicle.class);

}
