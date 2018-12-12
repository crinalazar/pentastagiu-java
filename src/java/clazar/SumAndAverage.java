package clazar;

public class SumAndAverage {
    public static void main(String[] args) {
       int min = 1;
       int max = 100;
        int sum = 0;
        float average = 0;
        int index;
        int counter = 0;


        for (index = min; index <= max; index++) {
            counter++;
            sum = sum + index;
            average = (float)sum / counter;
        }

       System.out.println("Sum is " + sum + " and average is " + average);
    }

}
