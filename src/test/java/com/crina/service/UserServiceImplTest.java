package com.crina.service;

import com.crina.model.Flight;
import com.crina.model.User;
import com.crina.repository.FlightRepository;
import com.crina.repository.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Optional;
import java.util.Set;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {

    @InjectMocks
    public UserServiceImpl userService;
    @Mock
    public FlightRepository flightRepository;
    @Mock
    public UserRepository userRepository;

//@Before
//public void setUp(){
//    this.userService = new UserServiceImpl();
//}
    @Test
    public void shouldReturnAllUsersForAFlight() {
        String flightId = "flightId";
        Flight flight = new Flight();
        User user = new User();
        flight.getPassengers().add( user );
        Mockito.when(flightRepository.findById( flightId )).thenReturn( Optional.of(flight));
        Set <User> passengers = userService.getAllUsers( flightId );
        Assert.assertNotNull( "Should not return null", passengers);
        Assert.assertEquals( "Should return users",user,passengers.iterator().next());
    }


    @Test
    public void shouldReturnNullForUnknownFlights() {
    String flightId = "unknownFlight";
    Mockito.when(flightRepository.findById( "unknownFlight" )).thenReturn( Optional.ofNullable( null ) );
    Set <User> passengers = userService.getAllUsers( flightId );
    Assert.assertNull( "Should not return a null response", passengers);
    }

    @Test
    public void shouldAddUserToFlight(){
        String flightId = "flightId";
        Flight flight = new Flight();
        User user = new User();
        flight.getPassengers().add( user );
        Mockito.when(flightRepository.findById( flightId )).thenReturn( Optional.of(flight));
        User user1 = userService.addPassenger( flightId,user );
        Assert.assertEquals( "should return user",user,user1 );


    }

}
