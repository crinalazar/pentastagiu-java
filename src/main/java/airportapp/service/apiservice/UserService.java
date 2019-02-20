package airportapp.service.apiservice;

import airportapp.model.UserEntity;

public interface UserService {

    UserEntity createUser (String email, String fname, String lname);
    void assignUserToFlight(String email, String flightName);
    void removeUsersByEmail(String email);
    void removeUserToFlight(String email);

}
