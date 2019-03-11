package com.crina.repository;

import com.crina.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {

    List<User> findFirst1ByNameOrderByDateOfBirth(String name);

}
