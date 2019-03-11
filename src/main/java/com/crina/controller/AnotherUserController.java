package com.crina.controller;

import com.crina.model.User;
import com.crina.service.api.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Set;

@RestController
@RequestMapping("/api/v1/flights")
public class AnotherUserController {

    @Resource
    private UserService userService;

    @GetMapping("/{flightId}/users")
    public Set<User> getAllUsers(@PathVariable String flightId) {
        return userService.getAllUsers(flightId);
    }

    @PostMapping("/{flightId}/users")
    public User addPassenger(@PathVariable String flightId, @RequestBody User user) {
        return userService.addPassenger(flightId, user);
    }
}