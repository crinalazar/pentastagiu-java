package Homework;

public class CountCharactString {
    public static void main(String[] args) {
        String base = "Hello Java World";
        char ch = 'a';
        System.out.println( "Target character found " + count(base, ch) + " times." );

    }
       public static int count(String base, char a) {
           int counter = 0;
           char c[] = base.toCharArray();


        for (int i = 0; i < base.length(); i++) {

        if ( c[i] == a) {
            counter++;
        }
    }
           return counter;

    }


    }