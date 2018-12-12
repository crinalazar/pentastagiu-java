package clazar;

public class SumAllNumbers {
    public static void main(String [] args) {
        int mytargetvariable = 5;
        int result = 0;

        //for (int index = 0; index <= mytargetvariable; index++) {
           // result = result + index;

        //}
        //System.out.println("Sum is " + result);
        System.out.println("Sum is " + sumnumbers(10) );
    }

        private static int sumnumbers(int targetvariable){
            int result = 0;

            for (int index = 0; index <= targetvariable; index++) {
                result = result + index;
        }
            return result;

    }
}
