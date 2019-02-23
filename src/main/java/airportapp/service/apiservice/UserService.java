package airportapp.service.apiservice;

import airportapp.model.UserEntity;
import java.util.Date;

public interface UserService {

    UserEntity createUser (String email, String fname, String lname, String birthDate);
    void assignUserToFlight(String email, String flightName);
    void removeUsersByEmail(String email);
    void removeUserToFlight(String email);

}
