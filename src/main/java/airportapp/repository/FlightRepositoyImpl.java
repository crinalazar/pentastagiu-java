package airportapp.repository;

import airportapp.model.FlightEntity;
import airportapp.model.StatusEnum;
import airportapp.repository.api.FlightRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Iterator;
import java.util.List;


@Repository
public class FlightRepositoyImpl implements FlightRepository {

@PersistenceContext
    private EntityManager entityManager;

    @Override
    public FlightEntity create(FlightEntity FlightToCreate) {
        entityManager.persist( FlightToCreate );
        return FlightToCreate;
    }

    public void save(FlightEntity fl) {
        this.entityManager.merge(fl);
    }

    public void getStatusFlights (StatusEnum flightStatus) {
        System.out.println( "\n" + flightStatus + " flights: " );
        Query query = this.entityManager.createQuery("select fl from FlightEntity fl where fl.status = :flightStatus");
        query.setParameter("flightStatus", flightStatus);
        List flights = query.getResultList();
        System.out.println(flights);
        System.out.println( "Number of " + flightStatus + " flights is " + flights.size() );
    }

@Override
    public void showListFlights() {

            System.out.println( "\n" + "Flights: " );
            Query q = entityManager.createQuery("select fl from FlightEntity fl");
            List flights = q.getResultList();
            if (flights.isEmpty()){
                System.out.println("No registered flight.");
            }
            else{
            Iterator itr = flights.iterator();
            FlightEntity fl;
            while (itr.hasNext()) {
                fl = (FlightEntity) itr.next();
                fl.getFlightStatus();
                    System.out.println(fl);
                }
            }
        }

    public FlightEntity findByName(String flightName){
        Query query = this.entityManager.createQuery("select fl from FlightEntity fl where fl.name = :flightName");
        query.setParameter("flightName", flightName);
        return (FlightEntity) query.getSingleResult();
    }



    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
