package airportapp;

import airportapp.repository.FlightRepositoyImpl;
import airportapp.repository.UserRepositoryImpl;
import airportapp.service.FlightServiceImpl;
import airportapp.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AirportMain {
    public static void main(String[] args) {

       ApplicationContext context = new ClassPathXmlApplicationContext( "airport-application-context.xml" );

        FlightServiceImpl flightServiceImpl = context.getBean( FlightServiceImpl.class );
        UserServiceImpl userServiceImpl = context.getBean( UserServiceImpl.class );
        FlightRepositoyImpl flightRepositoyImpl = context.getBean( FlightRepositoyImpl.class );
        UserRepositoryImpl userRepositoryImpl = context.getBean( UserRepositoryImpl.class );

          flightRepositoyImpl.showListFlights();
         // userRepositoryImpl.showListUsers();
         // userServiceImpl.removeUsersByEmail( "crinalazar.a@gmail.com" );
         // userRepositoryImpl.showListUsers();
            flightServiceImpl.flightsJoined( "anamaria.a@gmail.com" );
         // flightRepositoyImpl.findByName( "FL-254" );

//        flightServiceImpl.createFlight( "FL-254");
//        flightServiceImpl.createFlight( "FL-283");
//        flightServiceImpl.createFlight( "FL-166");
//        userServiceImpl.createUser( "crinalazar.a@gmail.com","Lazar", "Crina" );
//        userServiceImpl.createUser( "anamaria.a@gmail.com","Ana-Maria", "Costea" );
//        userServiceImpl.createUser( "tudormihalache.a@gmail.com","Tudor", "Mihalache" );

//        userServiceImpl.assignUserToFlight( "crinalazar.a@gmail.com","FL-254");
//        userServiceImpl.assignUserToFlight( "crinalazar.a@gmail.com","FL-166");
//        userServiceImpl.assignUserToFlight( "anamaria.a@gmail.com","FL-166");
//        userServiceImpl.assignUserToFlight( "tudormihalache.a@gmail.com","FL-283");


// [From first version without spring - hibernate ->]

//        airportManager.addFlights(flight);
//        airportManager.showListFlights();
//        airportManager.addUsers( user );
//        airportManager.showListUsers();
//        flight.addUserToFlight(user);
//        airportManager.flightsJoined( user );
//        airportManager.getStatusFlights(StatusEnum.SCHEDULED);
//        flight.showUsersOnFlight();



    }
}

