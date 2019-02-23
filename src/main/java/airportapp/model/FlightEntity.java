package airportapp.model;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Entity
@Table(name = "t_flight")
public class FlightEntity extends AbstractBaseEntity {
@Column(name = "name")
    private String name;
@Column(name = "destination")
    private String destination;
@Column(name = "departureDate")
    private Date departureDate;
@Column(name = "flightDuration")
     private int flightDuration;
@Column(name = "maxUserCapacity")
    private int maxUserCapacity;
@Enumerated(EnumType.STRING)
    private  StatusEnum status;


@ManyToMany(targetEntity = UserEntity.class)
    private Set<UserEntity> passengers = new HashSet<>();

    public FlightEntity() {
    }


    public FlightEntity(String name, String destination, String departureDate, int flightDuration,int maxUserCapacity) {
        this.name = name;
        this.destination = destination;
        this. flightDuration = flightDuration;
        this.maxUserCapacity = maxUserCapacity;
        setDate( departureDate );
        this.status = getFlightStatus();
        }


    public StatusEnum getFlightStatus() {
        Date current = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime( departureDate );
        cal.add(Calendar.SECOND, flightDuration);
        Date later = cal.getTime();

        if (this.flightDuration == 0){
            status = StatusEnum.CANCELED;}
        else if (this.departureDate.after( current )) {
            status = StatusEnum.SCHEDULED;
        } else if (later.before( current ))
        {
            status = StatusEnum.FINISHED;
        }
        else {
            status = StatusEnum.DEPARTED;
        }
        return status;
    }

    public void setDate(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat( "dd/MM/yyyy HH:mm" );
        try {
            this.departureDate = dateFormat.parse( date );
        } catch (ParseException e) {
            System.out.println( "Date type not valid. Please insert in format: dd/MM/yyyy HH:mm" );
        }
        }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof FlightEntity)) return false;
        FlightEntity flight = (FlightEntity) o;
        return Objects.equals( name, flight.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash( name );
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Set<UserEntity> getPassengers() {
        return passengers;
    }

    public void setPassengers(Set<UserEntity> passengers) {
        this.passengers = passengers;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public int getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(int flightDuration) {
        this.flightDuration = flightDuration;
    }

    public int getMaxUserCapacity() {
        return maxUserCapacity;
    }

    public void setMaxUserCapacity(int maxUserCapacity) {
        this.maxUserCapacity = maxUserCapacity;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }



    @Override
    public String toString() {
        return "FlightEntity{" +
                "name='" + name + '\'' +
                ", destination='" + destination + '\'' +
                ", departureDate=" + departureDate +
                ", status=" + status +
                '}';
    }
}
