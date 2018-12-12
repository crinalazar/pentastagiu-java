package Homework;

public class OddAndEven {
    public static void main(String[] args) {

        int[] a1 = {13, 20, 14, 5, 2, 8};
        int count1 = 0;
        int count2 = 0;

        for (int i =0; i < a1.length; i++) {

            if ( a1[i] % 2 == 0 ) {
                count1++;}
            else{
                count2++;
            }
            }
        System.out.println("Even numbers are " + count1 + " and odd numbers are " + count2);



        }
    }
