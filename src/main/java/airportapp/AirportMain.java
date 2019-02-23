package airportapp;

import airportapp.model.FlightEntity;
import airportapp.model.StatusEnum;
import airportapp.repository.FlightRepositoyImpl;
import airportapp.repository.UserRepositoryImpl;
import airportapp.repository.api.FlightRepository;
import airportapp.service.FlightServiceImpl;
import airportapp.service.UserServiceImpl;
import airportapp.service.apiservice.FlightService;
import airportapp.service.apiservice.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AirportMain {
    public static void main(String[] args) {

         ApplicationContext context = new FileSystemXmlApplicationContext("D:\\Stuff\\PentaStagiu\\airportapplication\\src\\main\\resources\\airport-application-context.xml");
       //ApplicationContext context = new ClassPathXmlApplicationContext( "airport-application-context.xml" );
         FlightService flightService = context.getBean( FlightService.class );
         UserService userService = context.getBean( UserService.class );
         FlightRepository flightRepositoy = context.getBean( FlightRepository.class );
//       UserRepositoryImpl userRepositoryImpl = context.getBean( UserRepositoryImpl.class );

         // flightRepositoy.showListFlights();
         // userRepositoryImpl.showListUsers();
         // userService.removeUsersByEmail( "crinalazar.a@gmail.com" );
         // flightService.flightsJoined( "anamaria.a@gmail.com" );
         // flightRepositoyImpl.findByName( "FL-254" );
         // flightService.removeFlightByName( "FL-654" );
         // flightRepositoy.getStatusFlights( StatusEnum.FINISHED );
         // flightService.showUsersOnFlight( "FL-587" );


//          flightService.createFlight( "FL-654", "Paris", "10/02/2019 20:30", 8500, 35 );
//          flightService.createFlight( "FL-587", "Oslo", "22/01/2019 15:45", 9300, 40);
//          flightService.createFlight(  "FL-325", "Frankfurt", "26/01/2019 14:15", 7200, 55);
//          flightService.createFlight(  "FL-805", "Londra", "20/04/2019 16:00", 6800, 30);

//        userService.createUser( "crinalazar.a@gmail.com","Lazar", "Crina",  "15.06.1990" );
//        userService.createUser( "anamaria.a@gmail.com","Ana-Maria", "Costea","10.09.1985" );
//        userService.createUser( "tudormihalache.a@gmail.com","Tudor", "Mihalache","23.01.1977");

//        userService.assignUserToFlight( "crinalazar.a@gmail.com","FL-654");
//        userService.assignUserToFlight( "anamaria.a@gmail.com","FL-587");
//        userService.assignUserToFlight( "tudormihalache.a@gmail.com","FL-325");

    }
}

