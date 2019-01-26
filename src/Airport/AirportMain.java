package Airport;


public class AirportMain {
    public static void main(String[] args) {

        Flight f1 = new Flight( "FL-654", "Paris", "10/02/2019 20:30", 12000, 35 );
        Flight f2 = new Flight( "FL-587", "Oslo", "22/01/2019 15:45", 27000, 40 );
        Flight f3 = new Flight( "FL-325", "Frankfurt", "25/01/2019 21:30", 89540, 55 );
        User u1 = new User( "Maria", "Pop", "15.06.1990");
        User u2 = new User( "Marius", "Pop", "10.09.1985");
        User u3 = new User( "Ioana", "Tanase", "23.01.1977");


        AirportManager airportManager = new AirportManager();
        airportManager.addUsers( u1 );
        airportManager.addUsers( u2 );
        airportManager.addUsers( u3 );
        airportManager.addFlights( f1 );
        airportManager.addFlights( f2 );
        airportManager.addFlights( f3 );
//        System.out.println(u2.compareTo( u3 ));
//        System.out.println(u2.equals( u3 ));

        //airportManager.showListUsers();
       // airportManager.showListFlights();

        f1.addUserToFlight( u1 );
        f1.addUserToFlight( u2 );
        f1.addUserToFlight( u3 );
        f2.addUserToFlight( u2 );
        f3.addUserToFlight( u1 );
       // f1.removeFromFlight( u1 );
       // airportManager.removeFlights( f1 );
        f1.showUsersOnFlight();
        airportManager.flightsJoined( u1 );
        f3.cancelFlight();
        airportManager.getStatusFlights(StatusEnum.SCHEDULED);
        airportManager.getStatusFlights(StatusEnum.FINISHED);
        airportManager.getStatusFlights( StatusEnum.CANCELED );
        //airportManager.getStatusFlights(StatusEnum.PROCESSING);
//       System.out.println(f2.getFlightStatus());
//       System.out.println(f1.getFlightStatus());








    }
}

