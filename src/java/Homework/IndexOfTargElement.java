package Homework;

public class IndexOfTargElement {
    public static void main(String[] args) {

        int[] a1 = {13, 20, 14, 5, 2, 8};
        int mytargelem = 5;


        for (int i = 0; i < a1.length; i++) {

            if (a1[i] == mytargelem) {

                System.out.println( "Index is : " + i );
            }


        }

    }
}