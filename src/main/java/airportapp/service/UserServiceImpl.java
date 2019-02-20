package airportapp.service;

import airportapp.model.FlightEntity;
import airportapp.model.UserEntity;
import airportapp.repository.api.FlightRepository;
import airportapp.repository.api.UserRepository;
import airportapp.service.apiservice.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Iterator;

@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;
    @Resource
    private FlightRepository flightRepository;
    @PersistenceContext
    private EntityManager entityManager;


  @Override
    public UserEntity createUser(String email, String fname, String lname) {
        UserEntity userEntity = new UserEntity(email, fname, lname);
        return userRepository.create(userEntity);
    }
@Override
    public void removeUsersByEmail(String email) {

        Query query = entityManager.createQuery("Select usr from UserEntity usr where usr.email = :userEmail");
        query.setParameter("userEmail", email);
        removeUserToFlight( email );
        entityManager.remove( query.getSingleResult());
        System.out.println("User " + email + " removed from system.");
    }

@Override
    public void assignUserToFlight(String email, String flightName){
        FlightEntity flightEntity = flightRepository.findByName(flightName);
        UserEntity userEntity = userRepository.findByEmail(email);

        flightEntity.getPassengers().add(userEntity);

        flightRepository.save(flightEntity);
    }
@Override
    public void removeUserToFlight(String email){
        Query q = entityManager.createQuery("select fl from FlightEntity fl");
        UserEntity userEntity = userRepository.findByEmail(email);
        FlightEntity fl;
        Iterator itr = q.getResultList().iterator();
        while (itr.hasNext()) {
            fl = (FlightEntity) itr.next();
            if (fl.getPassengers().contains( userEntity )) {
                fl.getPassengers().remove(userEntity);
                System.out.print( userEntity.getFname() + " " + userEntity.getLname() + " removed from flight  " + fl );
            }
        }

    }


}
