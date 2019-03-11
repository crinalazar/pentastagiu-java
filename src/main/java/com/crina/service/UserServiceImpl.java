package com.crina.service;

import com.crina.model.Flight;
import com.crina.model.User;
import com.crina.repository.FlightRepository;
import com.crina.repository.UserRepository;
import com.crina.service.api.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Set;
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Resource

    private FlightRepository flightRepository;

    @Resource
    private UserRepository userRepository;

    @Override
    public Set<User> getAllUsers(String flightId) {
        Flight flight = flightRepository.findById( flightId ).orElse( null );
        if (flight != null) {
            return flight.getPassengers();
        }
        return null;
    }

    @Override
    public User addPassenger(String flightId, User user) {
        Flight flight = flightRepository.findById(flightId).orElse(null);
        if (flight != null) {
            User dbUser = userRepository.save(user);
            flight.getPassengers().add(dbUser);
            flightRepository.save(flight);

            return user;
        }

        return null;
    }
}
