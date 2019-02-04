package airportapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.*;


@Component
public class AirportManager {
    @Autowired
    private HashSet<User> users;
    @Autowired
    private HashSet<Flight> flights;


    public void getStatusFlights (StatusEnum status) {
        System.out.println( "\n" + status + " flights: " );
        flights.stream().filter( flight -> flight.getFlightStatus().equals( status ) )
                .forEach( flight -> System.out.println( flight ) );
        long futureFlights = flights.stream().filter( flight -> flight.getFlightStatus().equals( status ) ).count();
        System.out.println( "Number of " + status + " flights is " + futureFlights );
    }


    public void showListUsers() {
        System.out.println( "Users: " );
        users.stream().forEach( user -> System.out.println( user ) );
    }

    public void showListFlights() {
        if (flights == null){
            System.out.println("No registered flight.");
        }
        else {
            System.out.println( "\n" + "Flights: " );
            flights.stream().forEach( flight -> System.out.println( flight ) );
        }
    }

    public Set<User> getUsers() {
        return users;
    }

    public Set<Flight> getFlights() {
        return flights;
    }

    public void addUsers(User user) {

        users.add( user );
    }

    public void addFlights(Flight flight) {
        flights.add( flight );
    }

    public void removeUsers(User user) {
        users.remove( user );
    }


    public void removeFlights(Flight flight) {
        flights.remove( flight );
    }

    public void flightsJoined (User user) {
        System.out.println("\n"+"Flights joined by user "+ user.getFName() +" "+ user.getLName()+ ":");
        flights.stream().filter( flight -> flight.usersOnFlight.contains( user ) )
                .forEach( user1 -> System.out.println( user1) );
        long noFlights = flights.stream().filter( flight -> flight.usersOnFlight.contains( user ) )
                .count();
        System.out.println("Number of flights joined by user " + user.getFName()+" " + user.getLName()+" is "+ noFlights + ".");


    }

}