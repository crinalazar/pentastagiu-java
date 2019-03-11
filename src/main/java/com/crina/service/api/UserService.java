package com.crina.service.api;

import com.crina.model.User;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface UserService {

    Set<User> getAllUsers(String flightId);

    User addPassenger(String flightId, User user);
}
