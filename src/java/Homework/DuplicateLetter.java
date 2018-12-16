package Homework;

public class DuplicateLetter {
    public static void main(String[] args) {

        String Duplicate = "Hello World";
        char s = '#';
        String update;

        update = Duplicate.substring( 0 , getPos( Duplicate ) ) + s + Duplicate.substring(getPos( Duplicate ));
        System.out.println( update );

    }

    public static int getPos(String Duplicate) {
        int i = 0;
        int counter =0;

        for (i = 0; i < Duplicate.length(); ++i) {
            if (Duplicate.charAt( i ) == Duplicate.charAt( i + 1 )) {
                counter = i + 1;
                break;
            }
        }
        return counter;
        }

}









