package Homework;

public class MinMaxAverageArray {
    public static void main(String[] args) {

        int[] a1 = {13, 20, 14, 5, 2, 8};

        int max = 0;
        int counter = 0;
        int min = a1[0];
        int sum = 0;
        float avg = 0;
        int count = 0;

        for ( int i = 0; i < a1.length; i++ ) {
            if (a1[i] > max) {
                max = a1[i];
                counter++;
            }
            else {
                if (a1[i] <= max) {
                    counter++;
                }
                }
            }

        System.out.println("Max Value is " + max);

        for ( int i = 1; i < a1.length; i++ ) {
            if (a1[i] < min) {
                min = a1[i];
                counter++;
            }
            else {
                if (a1[i] >= max) {
                    counter++;
                }

            }
        }
        System.out.println("Min Value is " + min);

        for (int i = 0; i < a1.length; i++) {
            count ++;
            sum = sum +a1[i];
            avg = (float) sum / count;

        }
        System.out.println("Average is " + avg);

        }



    }

