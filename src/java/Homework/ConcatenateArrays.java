package Homework;

import java.util.Arrays;

public class ConcatenateArrays {
    public static void main(String[] args) {

        int[] Arr1 = {1, 2, 3, 4};
        int[] Arr2 = {5, 6, 7, 8};

        int length = Arr1.length + Arr2.length;

                int [] concatenate = new int [length];
        System.arraycopy( Arr1, 0, concatenate, 0, Arr1.length );
        System.arraycopy( Arr2, 0, concatenate, Arr1.length, Arr2.length );

        System.out.println( Arrays.toString(concatenate));

    }
}
