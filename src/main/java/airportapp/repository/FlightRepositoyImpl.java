package airportapp.repository;

import airportapp.model.FlightEntity;
import airportapp.repository.api.FlightRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

    public void showListFlights() {
        FlightEntity fl;
        if (entityManager== null){
            System.out.println("No registered flight.");
        }
        else {
            System.out.println( "\n" + "Flights: " );
            Query q = entityManager.createQuery("select fl from FlightEntity fl");
            System.out.println(q.getResultList());
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
