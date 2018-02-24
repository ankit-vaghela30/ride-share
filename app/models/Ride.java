package models;

import javax.persistence.*;
import javax.inject.Named;
import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Finder;
import java.util.*;

@Entity
public class Ride extends Model {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer rideId;

	@Column(nullable = false)
	public String source;

	@Column(nullable = false)
	public String destination;

	@Column(nullable = false)
	public int cost;

	@Column(nullable = false)
	@play.data.format.Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:SS")
	public Date startTime;

	@ManyToOne(cascade = CascadeType.REMOVE, optional = false)
	public Driver driverRide;

	@ManyToOne(cascade = CascadeType.REMOVE, optional = false)
	public Vehicle vehicle;

	@OneToMany(mappedBy = "rideIdAssoc", cascade = CascadeType.ALL)
	public List<Rating> ridesRiderList;

	public static Finder<Integer, Ride> find = new Finder<Integer, Ride>(Ride.class);

}
