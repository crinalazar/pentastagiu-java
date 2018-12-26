package Board;

import java.util.ArrayList;
import java.util.Scanner;

public class Board {
    Scanner input = new Scanner( System.in );
    static ArrayList<User> users = new ArrayList<User>(5);
    static ArrayList<Message> boardMessages = new ArrayList<Message>();



    public static void registerUser(User user) {
        users.add(user);
    }


    public static void postMessage (Message message)
    {
        boardMessages.add( message );
    }

    public void showPosts () {
        if (!boardMessages.isEmpty()) {
            for (Message message : boardMessages) {
                System.out.println( "User:" + message.user.getName() + " messaged: " + message.getMessage() );
            }
        } else if (boardMessages.isEmpty()) {
            System.out.println( "No messages." );
        }

    }


}
