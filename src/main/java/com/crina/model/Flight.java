package com.crina.model;

import com.crina.service.EmptyFlightException;
import org.springframework.util.CollectionUtils;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "t_flight")
public class Flight extends BaseEntity {

@ManyToMany(targetEntity = User.class)
   private Set<User> passengers = new HashSet<>( );

    private  String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Set<User> getPassengers()
    {
        return passengers;
    }

    public void setPassengers(Set<User> passengers) {
        this.passengers = passengers;
    }
}
