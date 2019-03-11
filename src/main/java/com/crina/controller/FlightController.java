package com.crina.controller;

import com.crina.model.Flight;
import com.crina.model.User;
import com.crina.repository.FlightRepository;
import com.crina.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class FlightController {

    @Resource
    private FlightRepository flightRepository;
    @Resource
    private UserRepository userRepository;

    //@RequestMapping(value = "/flights", method = RequestMethod.GET)
    @GetMapping("/flights")
    public List <Flight> getFlights (){
        return flightRepository.findAll();
    }

    @PostMapping("/flights")
    @ResponseStatus(HttpStatus.CREATED)
    public Flight addFlight (@RequestBody Flight flight){
       return flightRepository.save( flight );
    }

    @GetMapping("/flights/{id}")
    public Flight getFlight (@PathVariable String id){
        return flightRepository.findById( id ).orElse( null );
    }

    @PutMapping("/flights/{id}")
    public Flight updateFlight(@RequestBody Flight flight, @PathVariable String id) {
        Flight dbflight = flightRepository.findById( id ).orElse( null );
        if (dbflight != null && flight.getPassengers().size() > 0){
            flight.getPassengers().forEach( passenger -> {
                User user = userRepository.findById( passenger.getId() ).orElse( null );
                if (user != null) { dbflight.getPassengers().add( user ); }      } );
           // dbflight.setName( flight.getName() );
            return flightRepository.save( dbflight );
        }
        return null;
    }

    @DeleteMapping("/flights/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteFlight(@PathVariable String id) {
        flightRepository.existsById( id );
    }
}




