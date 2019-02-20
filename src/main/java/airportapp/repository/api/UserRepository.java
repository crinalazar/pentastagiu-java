package airportapp.repository.api;

import airportapp.model.UserEntity;

public interface UserRepository {

    UserEntity create (UserEntity UserToCreate);
    UserEntity findByEmail(String email);
    void showListUsers();
    //void removeUsersByEmail(String email);
}
