package Homework;

public class LettersToNumbers {
    public static void main(String[] args) {

    String str = "abcd";
    char[] ch  = str.toCharArray();

    for(char c : ch)
    {
        int temp = (int)c;
        int temp2 = 97;
        if(temp<=122 & temp>=96)
            System.out.print(temp-temp2);

    }
}
}
