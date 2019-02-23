package airportapp.repository.api;

import airportapp.model.FlightEntity;
import airportapp.model.StatusEnum;

public interface FlightRepository {

    FlightEntity create (FlightEntity FlightToCreate);
    FlightEntity findByName(String flightName);
    void save(FlightEntity fl);
    void showListFlights();
    void getStatusFlights (StatusEnum flightStatus);

}
