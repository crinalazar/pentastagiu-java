package airportapp.repository;
import airportapp.model.UserEntity;
import airportapp.repository.api.UserRepository;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public UserEntity create(UserEntity UserToCreate) {
        entityManager.persist( UserToCreate );
        return UserToCreate;
    }

    public void showListUsers() {
        if (entityManager == null){
            System.out.println("No registered users.");
        }
        else {
            System.out.println( "\n" + "Users: " );
            Query q = entityManager.createQuery( "select u from UserEntity u" );
            System.out.println(q.getResultList());

        }
    }

    public UserEntity findByEmail(String email) {
        Query query = entityManager.createQuery("Select usr from UserEntity usr where usr.email = :userEmail");
        query.setParameter("userEmail", email);

        return (UserEntity) query.getSingleResult();
    }


}
