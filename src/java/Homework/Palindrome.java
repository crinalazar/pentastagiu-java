package Homework;

public class Palindrome {

    public static void main(String[] args) {
        String a = "aabcbaa";
        System.out.println(isPalindrome(a));

    }

    public static boolean isPalindrome(String a) {
        int n = a.length();
        for (int i = 0; i < n / 2; i++) {
            if (a.charAt( i ) != a.charAt( n - i - 1 )) {
                return false;
            }
            }
        return true;
        }

    }

