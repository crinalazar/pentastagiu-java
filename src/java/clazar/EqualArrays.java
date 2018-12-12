package clazar;

public class EqualArrays {
    public static void main(String[] args) {

        int[] Arr1 = {1, 2, 3, 4};
        int[] Arr2 = {1, 2, 4, 3};

        boolean equal = true;
        int i = 0;

        while (equal && i < Arr1.length) {

            if (Arr1[i] != Arr2[i]) {
                equal = false;
            }
            i++;
        }
         if (equal) {
             System.out.println( "True" );
         }
         else {
             System.out.println( "False" );
         }

        }
        }




