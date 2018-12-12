package clazar;

public class Fibonacci {
    public static void main(String[] args) {

            // float average = 0;
            int a = 0;
            int b = 1;
            int c;
            int n = 20;
            int sum = 0;
            float avg = 0;




                for (int i = 0; i < n; i++) {
                    System.out.print( b + "  " );
                    c = a + b;
                    a = b;
                    b = c;
                    sum = sum + a;
                    avg = (float)sum / n;

                }

         System.out.println("\n" + "Average is: " + avg);


    }

            }




