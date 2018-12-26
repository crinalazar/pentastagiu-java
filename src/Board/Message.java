package Board;

public class Message {

    public User user;
    String message;


    Message (String message, User user) {
        this.message = message;
        this.user = user;
        Board.postMessage(this);
            }

    public User getUser() {
        return user;
    }

    public String getMessage(){
        return message;
    }



            }

