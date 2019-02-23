package airportapp.service;

import airportapp.model.FlightEntity;
import airportapp.model.UserEntity;
import airportapp.repository.api.FlightRepository;
import airportapp.repository.api.UserRepository;
import airportapp.service.apiservice.FlightService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
@Transactional
public class FlightServiceImpl implements FlightService {

    @Resource
    private FlightRepository flightRepository;
    @PersistenceContext
    private EntityManager entityManager;
    @Resource
    private UserRepository userRepository;


   @Override
    public FlightEntity createFlight(String flightName, String destination, String departureDate, int flightDuration, int maxUserCapacity) {
        FlightEntity newFlight = new FlightEntity(flightName, destination, departureDate, flightDuration, maxUserCapacity);
        return flightRepository.create(newFlight);
    }
@Override
   public void showUsersOnFlight (String name){
       System.out.println("Passengers on flight " + name + ": ");
       Query query = entityManager.createQuery("Select fl from FlightEntity fl where fl.name = :name");
       query.setParameter( "name", name );
       FlightEntity passengers = (FlightEntity) query.getSingleResult();
       System.out.println(passengers.getPassengers());
    }
@Override
    public void removeFlightByName(String name) {

        Query query = entityManager.createQuery("Select fl from FlightEntity fl where fl.name = :flightName");
        query.setParameter("flightName", name);
        entityManager.remove( query.getSingleResult());
        System.out.println("User " + name + " removed from system.");
    }



@Override
    public void flightsJoined (String email) {
        UserEntity userEntity = userRepository.findByEmail( email );
        System.out.println( "\n" + "Flights joined by user " + userEntity.getFname() + " " + userEntity.getLname() + ":" );
        Query q = entityManager.createQuery( "select fl from FlightEntity fl" );
        List listflightts = q.getResultList();
        Iterator itr = listflightts.iterator();
        FlightEntity fl;
        int count= 0;
        while (itr.hasNext()) {
            fl = (FlightEntity) itr.next();
            if (fl.getPassengers().contains( userEntity )) {
                count++;
                System.out.print(fl );
            }
        }

        System.out.println("\n" + "Number of flights joined by user " + userEntity.getFname()+" " + userEntity.getLname()+" is "+ count + ".");
    }


    public FlightRepository getFlightRepository() {
        return flightRepository;
    }

    public void setFlightRepository(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }
}
