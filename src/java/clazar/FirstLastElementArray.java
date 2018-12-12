package clazar;

public class FirstLastElementArray {
    public static void main(String[] args) {


        int [] Arr = {13, 6, 2, 8, 2, 13};
        int first = Arr[0];
        int last = Arr[Arr.length - 1];


        if (first == last) {

            System.out.println( "TRUE" );
        } else {
            System.out.println( "FALSE" );
        }
    }
}


