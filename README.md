# ride-share
A Play2 framework based java web application

This project was done as part of course curriculum of Database Management Systems (CSCI6370) @ UGA. It was a final project of the course and was done in team of five students.

Details about the project can be found in /ride-share/documents which includes Relational Models (UML, BCNF and 3NF) of the project, project report and idea of the project.

## About
RideShare is a web application intended for commuters to share their rides with others.

## How to run
To successfully run the application, system needs two things.

1. SBT to run Play2 framework.
2. MySql server.

In the application.conf file present in conf folder, please change default.username and default.password of MySql server according to your mySQL server credentials. The default.url points to the database schema it is connected to.

You can run createSchema.SQL file to create the database schema. Even if you don't, the Model class will take care of it,
and will create the schema itself when you run the application. If you are creating schema using the script then after executing the application, please click on
'Mark it as Resolved' button, as the application tries to make schema from Model.

To insert some default data into the database you can run insertSchema.SQL file. Though it is not needed to have default values. The application is developed in a way that there is no dependency on default data.


To run the application run the following commands on CMD.

1. sbt
2. update
3. compile
4. run

After running the application browser will get opened with localhost:9000 as its URL. To navigate through the applicaiton, user will have to hit specific URLS.
Follow the below given flow to go through the application.

1. Register as Driver. 
2. Login as Driver.
(Note: Use the same credentials used in Registration)
3. Create Vehicle.
4. Create a Ride. 
5. Register as Rider. 
6. Login as Rider.
(Note: Use the same credentials used in Registration)
7. Search Rides.
(Note: Use same From and To places used while creating Ride. You can use other places too, but they won't appear on the page as the Rides do not exist)
8. Select appropriate Ride.
9. Rate and give Feedback to the Ride.
