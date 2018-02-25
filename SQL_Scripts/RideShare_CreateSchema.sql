CREATE DATABASE `rideshare` /*!40100 DEFAULT CHARACTER SET utf8 */;

CREATE TABLE `driver` (
  `driver_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `driver_license` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `phone_number` varchar(255) NOT NULL,
  PRIMARY KEY (`driver_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

CREATE TABLE `rider` (
  `rider_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `phone_number` varchar(255) NOT NULL,
  PRIMARY KEY (`rider_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

CREATE TABLE `vehicle` (
  `vehicle_id` int(11) NOT NULL AUTO_INCREMENT,
  `capacity` int(11) NOT NULL,
  `vehicle_name` varchar(255) NOT NULL,
  `vehicle_type` varchar(255) NOT NULL,
  `driver_driver_id` int(11) NOT NULL,
  PRIMARY KEY (`vehicle_id`),
  KEY `ix_vehicle_driver_driver_id` (`driver_driver_id`),
  CONSTRAINT `fk_vehicle_driver_driver_id` FOREIGN KEY (`driver_driver_id`) REFERENCES `driver` (`driver_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

CREATE TABLE `ride` (
  `ride_id` int(11) NOT NULL AUTO_INCREMENT,
  `source` varchar(255) NOT NULL,
  `destination` varchar(255) NOT NULL,
  `cost` int(11) NOT NULL,
  `start_time` datetime(6) NOT NULL,
  `driver_ride_driver_id` int(11) NOT NULL,
  `vehicle_vehicle_id` int(11) NOT NULL,
  PRIMARY KEY (`ride_id`),
  KEY `ix_ride_driver_ride_driver_id` (`driver_ride_driver_id`),
  KEY `ix_ride_vehicle_vehicle_id` (`vehicle_vehicle_id`),
  CONSTRAINT `fk_ride_driver_ride_driver_id` FOREIGN KEY (`driver_ride_driver_id`) REFERENCES `driver` (`driver_id`),
  CONSTRAINT `fk_ride_vehicle_vehicle_id` FOREIGN KEY (`vehicle_vehicle_id`) REFERENCES `vehicle` (`vehicle_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

CREATE TABLE `rating` (
  `rating_id` int(11) NOT NULL AUTO_INCREMENT,
  `rating` int(11) DEFAULT NULL,
  `feedback` varchar(255) DEFAULT NULL,
  `ride_id_assoc_ride_id` int(11) NOT NULL,
  `rider_id_assoc_rider_id` int(11) NOT NULL,
  PRIMARY KEY (`rating_id`),
  KEY `ix_rating_ride_id_assoc_ride_id` (`ride_id_assoc_ride_id`),
  KEY `ix_rating_rider_id_assoc_rider_id` (`rider_id_assoc_rider_id`),
  CONSTRAINT `fk_rating_ride_id_assoc_ride_id` FOREIGN KEY (`ride_id_assoc_ride_id`) REFERENCES `ride` (`ride_id`),
  CONSTRAINT `fk_rating_rider_id_assoc_rider_id` FOREIGN KEY (`rider_id_assoc_rider_id`) REFERENCES `rider` (`rider_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;


