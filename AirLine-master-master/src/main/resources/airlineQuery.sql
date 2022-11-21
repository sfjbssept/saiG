create database airlineReservation;
use airlineReservation;
/*remove comments to create tables*/
/*
CREATE TABLE `customer` (
  `customerid` INT NOT NULL,
  `firstname` VARCHAR(45) NULL,
  `lastname` VARCHAR(45) NULL,
  `emailid` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `phonenumber` VARCHAR(45) NULL,
  `country` VARCHAR(45) NULL,
  PRIMARY KEY (`customerid`));
select * from customer;  
create table `admin` (
    `email` VARCHAR(45) NOT NULL,
    `password` VARCHAR(45) NOT NULL,
    Primary Key (`email`)
);
select * from admin;

create table `flightdetails`(
  `flightid` integer not null,
  `flightnumber` varchar(30) null,
  `flightname` varchar(30) null,
  `source` varchar(30) null,
  `destination` varchar(30) null,
  `distance` float null,
  `days` varchar(30) null,
  `luggage` varchar(30) null,
  `departure` datetime null,
  `arrival` datetime null,
  `imagename` varchar(100) null,
  `extrafacility` varchar(30) null,
  `duration` varchar (30) null,
 primary key(`flightid`)
);
*/
insert into flightdetails(flightid,flightnumber,flightname,`source`,destination,distance,days,luggage,departure,arrival,imagename,extrafacility,duration) 
values(1,"Ar1-02", "Indigo", "Kolkata", "Ranchi", 100, "Mon,Tue,Wed,Thrus","15kg","2022-03-15 02:10:00", "2022-03-15 04:18:00","ind58.png","Wifi,Meal,Plug","2 hr 8 min"),
(2,"G8-334", "Go First", "New Delhi", "Mumbai", 100, "Mon,Tue,Wed","15kg","2022-03-15 04:18:00", "2022-03-15 10:40:00","Go58.png","Meal,Plug","5 hr 10 min"),
(3,"AI-868", "Air India", "New Delhi", "Kolkata", 100, "Mon,Tue,Wed,Thrus,Fri,Sat,Sun","15kg","2022-03-15 03:30:00", "2022-03-15 04:18:00","airindia58.png","Wifi","0 hr 48 min"),
(4, 'Ar1-02', 'Vistra', 'Japan', 'Delhi', 10000, 'Mon,Wed,Thrus,Sun', '15kg', '2022-03-15 11:42:00', '2022-03-15 13:52:00', 'vinset58.png', 'Wifi,Meal', '2 hr 10 min'),
(5, 'Em-02', 'Emariates', 'Mumbai', 'Dubai', 100, 'Mon,Tue,Wed,Thrus,Sat', '15kg', '2022-03-15 08:46:00', '2022-03-15 13:29:00', 'emirates58.png', 'Wifi,Meal,Plug', '4 hr 43 min'),
(6, 'Ar2-02', 'Indigo-2', 'Patna', 'Us', 100, 'Mon,Tue,Wed,Thrus', '15kg', '2022-03-15 09:24:00', '2022-03-15 11:17:00', 'ind58.png', 'Wifi,Meal,Plug', '1 hr 53 min'),
(7, 'SG-8157', 'SpiceJet', 'Bangalore', 'Russia', 100, 'Mon,Tue,Wed,Thrus', '15kg', '2022-03-15 06:14:00', '2022-03-15 09:47:00', 'spice58.png', 'Wifi,Meal,Plug', '3 hr 33 min'),
(8, 'I5-784', 'Air Asia', 'Kochi', 'Kerla', 100, 'Thrus', '15kg', '2022-03-15 06:16:00', '2022-03-15 08:36:00', 'airasia58.png', 'Wifi,Meal,Plug', '2 hr 20 min'),
(9, 'AI-411', 'Air India', 'New Delhi', 'Chennai', 100, 'Mon,Tue,Sat', '15kg', '2022-03-15 03:16:00', '2022-03-15 09:26:00', 'airindia58.png', 'Wifi,Meal,Plug', '6 hr 10 min'),
(10, '6E-744', 'Spice Jet', 'Goa', 'Jaipur', 100, 'Mon,Sun', '15kg', '2022-03-15 14:12:00', '2022-03-15 20:22:00', 'spice58.png', 'Plug', '6 hr 10 min'),
(11, 'G8-334', 'Go First', 'Kolkata', 'Ranchi', 100, 'Mon,Tue,Wed', '15kg', '2022-03-15 15:16:00', '2022-03-15 19:26:00', 'Go58.png', 'Meal,Plug', '4 hr 10 min'),
(12, 'AI-868', 'Air India', 'Kolkata', 'Ranchi', 100, 'Mon,Tue,Wed,Thrus,Fri,Sat,Sun', '15kg', '2022-03-15 06:06:00', '2022-03-15 10:59:00', 'airindia58.png', 'Wifi', '4 hr 53 min'),
(13, 'Ar1-02', 'Vistra', 'Kolkata', 'Ranchi', 10000, 'Mon,Wed,Thrus,Sun', '15kg', '2022-03-15 13:16:00', '2022-03-15 15:46:00', 'vinset58.png', 'Wifi,Meal', '2 hr 30 min'),
(14, 'Em-02', 'Emariates', 'Kolkata', 'Ranchi', 100, 'Mon,Tue,Wed,Thrus,Sat', '15kg', '2022-03-15 08:12:00', '2022-03-15 12:11:00', 'emirates58.png', 'Wifi,Meal,Plug', '3 hr 59 min'),
(15, 'Ar2-02', 'Indigo-2', 'Kolkata', 'Ranchi', 100, 'Mon,Tue,Wed,Thrus', '15kg', '2022-03-15 12:32:00', '2022-03-15 13:12:00', 'ind58.png', 'Wifi,Meal,Plug', '0 hr 40 min'),
(16, 'SG-8157', 'SpiceJet', 'Kolkata', 'Ranchi', 100, 'Mon,Tue,Wed,Thrus', '15kg', '2022-03-15 13:16:00', '2022-03-15 15:46:00', 'spice58.png', 'Wifi,Meal,Plug', '2 hr 30 min'),
(17, 'I5-784', 'Air Asia', 'Kolkata', 'Ranchi', 100, 'Thrus', '15kg', '2022-03-15 06:32:00', '2022-03-15 17:52:00', 'airasia58.png', 'Wifi,Meal,Plug', '11 hr 20 min'),
(18, 'AI-411', 'Air India', 'Kolkata', 'Ranchi', 100, 'Mon,Tue,Sat', '15kg', '2022-03-15 20:12:00', '2022-03-15 21:32:00', 'airindia58.png', 'Wifi,Meal,Plug', '1 hr 20 min'),
(19, '6E-744', 'Spice Jet', 'Kolkata', 'Ranchi', 100, 'Mon,Sun', '15kg', '2022-03-15 14:12:00', '2022-03-15 20:22:00', 'spice58.png', 'Plug', '6 hr 10 min');

#select * from flightdetails;

/*
create table `seat`(
   id integer Not Null UNIQUE,
   seatclass varchar(40) null,
   flightid integer not null,
   priceforbooking float not null,
   priceforcancel float not null,
   tax float not null,
   primary key(id), 
   FOREIGN KEY (flightid) REFERENCES `flightdetails`(flightid)
);
*/
insert into seat values 
(1,'ECONOMY',1,5000,350,300),(2,'BASIC_ECONOMY',1,5500,350,300),(3,'PREMIUM_ECONOMY',1,10000,5000,400),(4,'BUSINESS',1,25000,15000,1500),(5,'FIRST',1,50000,25000,1500),
(6,'ECONOMY',2,5000,350,300),(7,'BASIC_ECONOMY',2,5500,350,300),(8,'PREMIUM_ECONOMY',2,10000,5000,400),(9,'BUSINESS',2,25000,15000,1500),(10,'FIRST',2,50000,25000,1500),
(11,'ECONOMY',3,2000,350,300),(12,'BASIC_ECONOMY',3,2500,350,300),(13,'PREMIUM_ECONOMY',3,7000,450,400),(14,'BUSINESS',3,15000,900,400),(15,'FIRST',3,25000,1500,700),
(16,'ECONOMY',4,4500,350,300),(17,'BASIC_ECONOMY',4,6500,350,300),(18,'PREMIUM_ECONOMY',4,15000,5000,400),(19,'BUSINESS',4,27000,15000,1500),(20,'FIRST',4,100000,50000,3000),
(21,'ECONOMY',5,5679,220,140),(22,'BASIC_ECONOMY',5,7892,330,179),(23,'PREMIUM_ECONOMY',5,13567,3456,289),(24,'BUSINESS',5,18756,3678,380),(25,'FIRST',5,35789,4567,500),
(26,'ECONOMY',6,5000,350,300),(27,'BASIC_ECONOMY',6,5500,350,300),(28,'PREMIUM_ECONOMY',6,10000,5000,400),(29,'BUSINESS',6,25000,15000,1500),(30,'FIRST',6,50000,25000,1500),
(31,'ECONOMY',7,5000,350,300),(32,'BASIC_ECONOMY',7,5500,350,300),(33,'PREMIUM_ECONOMY',7,10000,5000,400),(34,'BUSINESS',7,25000,15000,1500),(35,'FIRST',7,50000,25000,1500),
(36,'ECONOMY',8,5000,350,300),(37,'BASIC_ECONOMY',8,5500,350,300),(38,'PREMIUM_ECONOMY',8,10000,5000,400),(39,'BUSINESS',8,25000,15000,1500),(40,'FIRST',8,50000,25000,1500),
(41,'ECONOMY',9,5000,350,300),(42,'BASIC_ECONOMY',9,5500,350,300),(43,'PREMIUM_ECONOMY',9,10000,5000,400),(44,'BUSINESS',9,25000,15000,1500),(45,'FIRST',9,50000,25000,1500),
(46,'ECONOMY',10,5000,350,300),(47,'BASIC_ECONOMY',10,5500,350,300),(48,'PREMIUM_ECONOMY',10,10000,5000,400),(49,'BUSINESS',10,25000,15000,1500),(50,'FIRST',10,50000,25000,1500),
(51,'ECONOMY',11,5000,350,300),(52,'BASIC_ECONOMY',11,5500,350,300),(53,'PREMIUM_ECONOMY',11,10000,5000,400),(54,'BUSINESS',11,25000,15000,1500),(55,'FIRST',11,50000,25000,1500),
(56,'ECONOMY',12,5000,350,300),(57,'BASIC_ECONOMY',12,5500,350,300),(58,'PREMIUM_ECONOMY',12,10000,5000,400),(59,'BUSINESS',12,25000,15000,1500),(60,'FIRST',12,50000,25000,1500),
(61,'ECONOMY',13,2000,350,300),(62,'BASIC_ECONOMY',13,2500,350,300),(63,'PREMIUM_ECONOMY',13,7000,450,400),(64,'BUSINESS',13,15000,900,400),(65,'FIRST',13,25000,1500,700),
(66,'ECONOMY',14,4500,350,300),(67,'BASIC_ECONOMY',14,6500,350,300),(68,'PREMIUM_ECONOMY',14,15000,5000,400),(69,'BUSINESS',14,27000,15000,1500),(70,'FIRST',14,100000,50000,3000),
(71,'ECONOMY',15,5679,220,140),(72,'BASIC_ECONOMY',15,7892,330,179),(73,'PREMIUM_ECONOMY',15,13567,3456,289),(74,'BUSINESS',15,18756,3678,380),(75,'FIRST',15,35789,4567,500),
(76,'ECONOMY',16,5000,350,300),(77,'BASIC_ECONOMY',16,5500,350,300),(78,'PREMIUM_ECONOMY',16,10000,5000,400),(79,'BUSINESS',16,25000,15000,1500),(80,'FIRST',16,50000,25000,1500),
(81,'ECONOMY',17,5000,350,300),(82,'BASIC_ECONOMY',17,5500,350,300),(83,'PREMIUM_ECONOMY',17,10000,5000,400),(84,'BUSINESS',17,25000,15000,1500),(85,'FIRST',17,50000,25000,1500),
(86,'ECONOMY',18,5000,350,300),(87,'BASIC_ECONOMY',18,5500,350,300),(88,'PREMIUM_ECONOMY',18,10000,5000,400),(89,'BUSINESS',18,25000,15000,1500),(90,'FIRST',18,50000,25000,1500),
(91,'ECONOMY',19,5000,350,300),(92,'BASIC_ECONOMY',19,5500,350,300),(93,'PREMIUM_ECONOMY',19,10000,5000,400),(94,'BUSINESS',19,25000,15000,1500),(95,'FIRST',19,50000,25000,1500);
insert into customer values(1,"India", "admin123@gmail.com",1,"Admin","Boy","d3UYATI","password","9324567890","ADMIN","admin","1111 2222 3456");
/*
create table seatstatus (
id integer not null AUTO_INCREMENT,
flightid integer not null,
totalSeats int null,
availableSeats int null,
bookedSeats int null,
economyseatstotal int null,
economyseatsavailable int null,
economyseatsbooked int null,
basiceconomyseatstotal int null,
basiceconomyseatsavailable int null,
basiceconomyseatsbooked int null,
premiumeconomyseatstotal int null,
premiumeconomyseatsavailable int null,
premiumeconomyseatsbooked int null,
businessseatstotal int null,
businessseatsavailable int null,
businessseatsbooked int null,
firstseatstotal int null,
firstseatsavailable int null,
firstseatsbooked int null,
primary key(id),
FOREIGN KEY (flightid) REFERENCES `flightdetails`(flightid)
);
*/
insert into seatstatus(flightid,totalSeats,
availableSeats,bookedSeats,economyseatstotal,economyseatsavailable,economyseatsbooked,basiceconomyseatstotal,basiceconomyseatsavailable,basiceconomyseatsbooked,premiumeconomyseatstotal,
premiumeconomyseatsavailable,premiumeconomyseatsbooked,businessseatstotal,businessseatsavailable,businessseatsbooked,firstseatstotal,firstseatsavailable,firstseatsbooked) 
values (1,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0),(2,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0),(3,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0),
(4,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0),(5,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0),
(6,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0),(7,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0),
(8,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0),(9,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0),
(10,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0),(11,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0),
(12,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0),(13,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0),
(14,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0),(15,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0),(16,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0),
(17,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0),(18,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0),(19,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0);


/*
create table users(
username varchar(50) not null,
password varchar(30) not null,
enabled boolean,
primary key(username)
);
*/
#drop table users;
/*
create table authorites (
 username varchar(50) not null,
 authorities varchar(30) not null,
 FOREIGN KEY (username) REFERENCES users(username)
);
*/
select * from customer;
select * from admin;
#insert into Admin values("admin","password");
#drop table Admin;

select * from flightdetails;
select * from seat;
select * from likes;
select * from spring_session;
select * from spring_session_attributes;
select * from user_authorities;
#select * from likes;
select * from travelcustomer;
select * from ticketbooking;
select * from airport;
select * from seatstatus;
/*
create table airport (
 id Integer Not Null AUTO_INCREMENT,
 country varchar(255),
 flightid integer,
 nameofairport varchar(255),
 city varchar(255),
 primary key (id)
);
insert into airport(id,country,flightid,nameofairport,city) 
values
(1, 'India', 1, 'Kolkata Airport', 'Kolkata'),
(2, 'India', 1, 'Ranchi Airport', 'Ranchi'),
(3, 'India', 2, 'Kolkata Airport', 'Kolkata'),
(4, 'India', 2, 'Ranchi Airport', 'Ranchi'),
(5, 'India',3, 'Kolkata Airport', 'Kolkata'),
(6, 'India', 4, 'Ranchi Airport', 'Ranchi'),
(7, 'India', 3, 'Ranchi Airport', 'Ranchi'),
(8, 'India', 4, 'Kolkata Airport', 'Kolkata'),
(9, 'India', 5, 'Kolkata Airport', 'Kolkata'),
(10, 'India', 5, 'Ranchi Airport', 'Ranchi'),
(11, 'India', 6, 'Kolkata Airport', 'Kolkata'),
(12, 'India', 6, 'Ranchi Airport', 'Ranchi'),
(13, 'India', 7, 'Kolkata Airport', 'Kolkata'),
(14, 'India', 7, 'Ranchi Airport', 'Ranchi'),
(15, 'India', 8, 'Kolkata Airport', 'Kolkata'),
(16, 'India', 8, 'Ranchi Airport', 'Ranchi'),
(17, 'India', 9, 'Kolkata Airport', 'Kolkata'),
(18, 'India', 9, 'Ranchi Airport', 'Ranchi'),
(19, 'India', 10, 'Kolkata Airport', 'Kolkata'),
(20, 'India', 10, 'Ranchi Airport', 'Ranchi'),
(21, 'India', 11, 'Kolkata Airport', 'Kolkata'),
(22, 'India', 11, 'Ranchi Airport', 'Ranchi'),
(23, 'India', 12, 'Kolkata Airport', 'Kolkata'),
(24, 'India', 12, 'Ranchi Airport', 'Ranchi'),
(25, 'India', 13, 'Kolkata Airport', 'Kolkata'),
(26, 'India', 13, 'Ranchi Airport', 'Ranchi'),
(27, 'India', 14, 'Kolkata Airport', 'Kolkata'),
(28, 'India', 14, 'Ranchi Airport', 'Ranchi'),
(29, 'India', 15, 'Kolkata Airport', 'Kolkata'),
(30, 'India', 15, 'Ranchi Airport', 'Ranchi'),
(31, 'India', 16, 'Kolkata Airport', 'Kolkata'),
(32, 'India', 16, 'Ranchi Airport', 'Ranchi'),
(33, 'India', 17, 'Kolkata Airport', 'Kolkata'),
(34, 'India', 17, 'Ranchi Airport', 'Ranchi'),
(35, 'India', 18, 'Kolkata Airport', 'Kolkata'),
(36, 'India', 18, 'Ranchi Airport', 'Ranchi'),
(37, 'India', 19, 'Kolkata Airport', 'Kolkata'),
(38, 'India', 19, 'Ranchi Airport', 'Ranchi');
*/

select * from flightdetails;
select * from airport where flightid=1 and city = "Ranchi";
/*
update flightdetails set departure = '2022-03-15 02:10:00', arrival = '2022-03-15 04:18:00' where flightid = 1;
update flightdetails set departure = '2022-03-15 04:18:00', arrival = '2022-03-15 10:40:00' where flightid = 2;
update flightdetails set departure = '2022-03-15 03:30:00', arrival = '2022-03-15 04:18:00' where flightid = 3;
update flightdetails set departure = '2022-03-15 11:42:00', arrival = '2022-03-15 13:52:00' where flightid = 4;
update flightdetails set departure = '2022-03-15 08:46:00', arrival = '2022-03-15 13:29:00' where flightid = 5;
update flightdetails set departure = '2022-03-15 09:24:00', arrival = '2022-03-15 11:17:00' where flightid = 6;
update flightdetails set departure = '2022-03-15 06:14:00', arrival = '2022-03-15 09:47:00' where flightid = 7;
update flightdetails set departure = '2022-03-15 06:16:00', arrival = '2022-03-15 08:36:00' where flightid = 8;
update flightdetails set departure = '2022-03-15 03:16:00', arrival = '2022-03-15 09:26:00' where flightid = 9;
update flightdetails set departure = '2022-03-15 14:12:00', arrival = '2022-03-15 20:22:00' where flightid = 10;
update flightdetails set departure = '2022-03-15 15:16:00', arrival = '2022-03-15 19:26:00' where flightid = 11;
update flightdetails set departure = '2022-03-15 06:06:00', arrival = '2022-03-15 10:59:00' where flightid = 12;
update flightdetails set departure = '2022-03-15 13:16:00', arrival = '2022-03-15 15:46:00' where flightid = 13;
update flightdetails set departure = '2022-03-15 08:12:00', arrival = '2022-03-15 12:11:00' where flightid = 14;
update flightdetails set departure = '2022-03-15 12:32:00', arrival = '2022-03-15 13:12:00' where flightid = 15;
update flightdetails set departure = '2022-03-15 13:16:00', arrival = '2022-03-15 15:46:00' where flightid = 16;
update flightdetails set departure = '2022-03-15 06:32:00', arrival = '2022-03-15 17:52:00' where flightid = 17;
update flightdetails set departure = '2022-03-15 20:12:00', arrival = '2022-03-15 21:32:00' where flightid = 18;
update flightdetails set departure = '2022-03-15 14:12:00', arrival = '2022-03-15 20:22:00' where flightid = 19;

*/
