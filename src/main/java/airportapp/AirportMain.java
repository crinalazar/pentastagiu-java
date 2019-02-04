package airportapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AirportMain {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext( "airport-application-context.xml" );

        AirportManager airportManager = context.getBean(AirportManager.class);

        Flight flight = context.getBean( Flight.class );
        flight.setName( "FL-874" );
        flight.setDestination( "Oslo" );
        flight.setDate("12/09/2019 10:30" );
        flight.setFlightDuration( 9800 );
        flight.setMaxUserCapacity( 40 );
        flight.getFlightStatus();

        User user = context.getBean( User.class );
        user.setFName( "Rotariu" );
        user.setLName( "Cosmin" );
        user.setBirthDate("13.08.1992");

        airportManager.addFlights(flight);
        airportManager.showListFlights();
        airportManager.addUsers( user );
        airportManager.showListUsers();
        flight.addUserToFlight(user);
        airportManager.flightsJoined( user );
        airportManager.getStatusFlights(StatusEnum.SCHEDULED);
        flight.showUsersOnFlight();



    }
}

