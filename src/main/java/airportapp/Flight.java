package airportapp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

enum StatusEnum {SCHEDULED, CANCELED, FINISHED, PROCESSING}
@Component
public class Flight  {

    private String name;
    private String destination;
    private Date departureDate;
    private int flightDuration;
    private int maxUserCapacity;
    private StatusEnum status;
    Date current = new Date();
    @Autowired
    HashSet <User> usersOnFlight;


    public void showUsersOnFlight () {
        System.out.println("Users registered for flight: " + this.getName()+ " to " + this.destination);
        usersOnFlight.stream().forEach( s -> System.out.println(s) );
    }



    public void addUserToFlight(User user) {
        if (usersOnFlight.contains( user )) {
            System.out.println("User " + user.getFName() +" "+ user.getLName() + " already added.");}

        if (this.usersOnFlight.size() < this.maxUserCapacity) {
            usersOnFlight.add( user );


        } else {
            System.out.println( "Could not add passenger. All seats reserved for flight: " + getName() );

        }
    }

    public void removeFromFlight (User user){
        usersOnFlight.remove( user );
    }

    public void setDate(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat( "dd/MM/yyyy HH:mm" );
        try {
            this.departureDate = dateFormat.parse( date );
        } catch (ParseException e) {
            System.out.println( "Date type not valid. Please insert in format: dd/MM/yyyy HH:mm" );

        }
    }

    public StatusEnum getFlightStatus() {
        Calendar cal = Calendar.getInstance();
        cal.setTime( departureDate );
        cal.add(Calendar.SECOND, 7200);
        Date later = cal.getTime();

        if (flightDuration == 0){
            status = StatusEnum.CANCELED;}
        else if (departureDate.after( current )) {
            status = StatusEnum.SCHEDULED;
        } else if (later.before( current ))
        {
            status = StatusEnum.FINISHED;
        }
        else {
            status = StatusEnum.PROCESSING;
        }
        return status;
    }

    public StatusEnum cancelFlight() {
        this.flightDuration = 0;
        this.status = StatusEnum.CANCELED;
        return status;
    }



    @Override
    public String toString() {
        return "Flight{" +
                "name='" + name + '\'' +
                ", destination='" + destination + '\'' +
                ", departureDate=" + departureDate +
                ", flightDuration=" + flightDuration +
                ", maxUserCapacity=" + maxUserCapacity +
                ", status=" + status +
                '}';
    }

    public int getMaxUserCapacity() {
        return maxUserCapacity;
    }

    public String getName() {
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return Objects.equals( name, flight.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash( name );
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public void setFlightDuration(int flightDuration) {
        this.flightDuration = flightDuration;
    }

    public void setMaxUserCapacity(int maxUserCapacity) {
        this.maxUserCapacity = maxUserCapacity;
    }
}
