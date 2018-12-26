package Board;
import java.util.Scanner;

public class MainClassBoard {

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in );
        User testUser = new User( "Ioana", "ioana@gmail.com" );
        User testUser1 = new User( "Andrei", "andrei@gmail.com" );


        Message message = new Message( "Hello everyone!", testUser );
        message = new Message( "I'm Andrei.", testUser1 );

        Board board = new Board();


        while (true) {
            User user;
            {
                System.out.println( "Please insert your name: " );
                String name = input.nextLine();
                System.out.println( "Please insert your email: " );
                String email = input.nextLine();
                user = new User( name, email );
                System.out.println( "You have been registered.Welcome!" );
                board.showPosts();
                System.out.println( "Post message to board: " );
                String text = "";
                text = input.nextLine();
                message = new Message( text, user );
            }


        }


    }
}
