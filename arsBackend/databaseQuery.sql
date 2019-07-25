create table flightDetails(

	flightId int AUTO_INCREMENT,
	flightName varchar(25),
	fare bigint(10),
	startPoint varchar(20),
	destination varchar(20),
	departureTime varchar(10),
	arrivalTime varchar(10),
	no_of_seats int(10),
	vaccantSeat boolean,
	
	constraint pk_flightDetails_flightId primary key(flightId)
);