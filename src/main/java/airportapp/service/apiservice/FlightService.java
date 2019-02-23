package airportapp.service.apiservice;

import airportapp.model.FlightEntity;

import java.util.Date;

public interface FlightService {

   FlightEntity createFlight (String flightName, String destination, String departureDate, int flightDuration, int maxUserCapacity);
   void flightsJoined (String email);
   void removeFlightByName(String name);
   void showUsersOnFlight (String name);

}
