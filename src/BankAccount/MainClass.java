package BankAccount;


import java.util.Scanner;


public class MainClass {
    public static void main(String[] args) {

        String name;
        Scanner input = new Scanner( System.in );


        System.out.println( "User" );
        System.out.print( "Type your name: " );
        name = input.nextLine();


        Account myAccount = new Account(name);
        myAccount.start();






    }
}