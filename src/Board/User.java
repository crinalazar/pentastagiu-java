package Board;



public class User {

    String name;
    String email;


    User (String name, String email) {
        this.name = name;
        this.email = email;
        Board.registerUser( this );

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
