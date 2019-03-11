package com.crina.controller;

import com.crina.model.Flight;
import com.crina.model.User;
import com.crina.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Resource
    private UserRepository userRepository;

    @GetMapping
    public List<User> getUsers (@PathParam("searchName") String searchName) {
        if (searchName == null) {
            return userRepository.findAll();
       } else {
          return userRepository.findFirst1ByNameOrderByDateOfBirth(searchName);
        }
   }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable String id) {
        return userRepository.findById(id).orElse(null);
    }

    @PutMapping
    public User updateUser(@RequestBody User user, @PathVariable String id) {
        User dbuser = userRepository.findById( id ).orElse( null );
        if (dbuser != null){
            dbuser.setName( user.getName() );
            return userRepository.save( dbuser );
        }
        return null;
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteFlight(@PathVariable String id) {
        userRepository.existsById( id );
    }


}
