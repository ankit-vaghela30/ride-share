INSERT INTO `rideshare`.`driver`
(`first_name`,
`last_name`,
`gender`,
`driver_license`,
`password`,
`email`,
`phone_number`)
VALUES
('prasad',
'Mate',
'M',
'1234567899',
'$2a$10$m58HPMp1vJcereGyyd3ja.kbtl8lF7JSyR9WNiAKpfcyg2WOR4Zga',
'p.m@abc.com',
9876543219);

INSERT INTO `rideshare`.`vehicle`
(`capacity`,
`vehicle_name`,
`vehicle_type`,
`driver_driver_id`)
VALUES
(6,
'BMW',
'SUV',
1);

INSERT INTO `rideshare`.`ride`
(`source`,
`destination`,
`cost`,
`start_time`,
`driver_ride_driver_id`,
`vehicle_vehicle_id`)
VALUES
('ATL',
'Athens',
45,
'2017-12-31 20:00:09',
1,
1);

INSERT INTO `rideshare`.`rider`
(`first_name`,
`last_name`,
`gender`,
`password`,
`email`,
`phone_number`)
VALUES
('Akshay',
'Mendki',
'M',
'$2a$10$6XAjrvTeZHD/MgnS8QHtieiQ1h0Ju.ZSg/ey2b.9ZA4dJHnkyi.ii',
'a.k@abc.com',
1234567899);

INSERT INTO `rideshare`.`rating`
(`rating`,
`feedback`,
`ride_id_assoc_ride_id`,
`rider_id_assoc_rider_id`)
VALUES
(5,
'Very Good',
1,
1);

