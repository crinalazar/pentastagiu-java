package clazar;

public class EndOfString {
    public static void main(String[] args) {

        String a = "Hello Jsvs World";
        String b = "orld";
        System.out.println(check( a,b ));

}
        public static boolean check(String a, String b) {

            if (a.endsWith(b)) {
                return true;
            } else {
                return false;
            }
        }

    }

