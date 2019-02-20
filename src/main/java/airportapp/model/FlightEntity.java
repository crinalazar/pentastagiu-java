package airportapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "t_flight")
public class FlightEntity extends AbstractBaseEntity {
@Column(name = "name")
    private String name;
@ManyToMany(targetEntity = UserEntity.class)
    private Set<UserEntity> passengers = new HashSet<>();

    public FlightEntity() {
    }

    public FlightEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<UserEntity> getPassengers() {
        return passengers;
    }

    public void setPassengers(Set<UserEntity> passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "FlightEntity{" +
                "name='" + name + '\'' +
                '}';
    }
}
