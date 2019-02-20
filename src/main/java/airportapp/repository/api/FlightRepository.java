package airportapp.repository.api;

import airportapp.model.FlightEntity;

public interface FlightRepository {

    FlightEntity create (FlightEntity FlightToCreate);
    FlightEntity findByName(String flightName);
    void save(FlightEntity fl);

}
