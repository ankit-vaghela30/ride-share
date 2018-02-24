package models;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Id;

import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Finder;
import java.util.*;

@Entity
public class Rider extends Model {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer riderId;
	@Column(nullable = false)
	public String firstName;
	@Column(nullable = false)
	public String lastName;
	@Column(nullable = false)
	public char gender;
	@Column(nullable = false)
	public String password;
	@Column(nullable = false)
	public String email;
	@Column(nullable = false)
	public String phoneNumber;

	@OneToMany(mappedBy = "riderIdAssoc", cascade = CascadeType.ALL)
	public List<Rating> riderRidesList;

public static Finder<Integer, Rider> find = new Finder<Integer, Rider>(Rider.class);

}
