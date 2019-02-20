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
    public FlightEntity createFlight(String flightName) {
        FlightEntity newFlight = new FlightEntity(flightName);
        return flightRepository.create(newFlight);
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
                System.out.print( userEntity.getFname() + userEntity.getLname() + " joined  " + fl );
                count++;
            }
        }
        System.out.println("Number of flights joined by user " + userEntity.getFname()+" " + userEntity.getLname()+" is "+ count + ".");
    }

    public FlightRepository getFlightRepository() {
        return flightRepository;
    }

    public void setFlightRepository(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }
}
