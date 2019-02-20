package airportapp.service.apiservice;

import airportapp.model.FlightEntity;

public interface FlightService {

   FlightEntity createFlight(String flightName);
   void flightsJoined (String email);
}
