package BankAccount;
import java.util.Scanner;


public class Account {

    private double balance = 5800;
    private String name;


    Scanner input = new Scanner( System.in );

    public Account(String name) {

        this.name = name;
    }

    public void cashOut(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println( "New balance: " + balance + "\n" );
            System.out.println( name + " cashed out: " + amount + "\n" );
        } else {
            System.out.println( "Insufficient funds" + "\n" );
        }
    }

    public void makeDeposit(double amount) {
        balance += amount;
        System.out.println( "New balance: " + balance + "\n" );
        System.out.println( name + " made a deposit of : " + amount + "\n" );
    }

    public void start() {
        int option;

        do {
            showMenu();
            option = input.nextInt();
            chooseOption( option );
        } while (option != 3);
    }

    public void showMenu() {

        System.out.println( "\t Choose: " );
        System.out.println( "1 - Withdrawal" );
        System.out.println( "2 - Deposit" );
        System.out.println( "3 - Exit" );
        System.out.print( "Option: " );

    }

    public void chooseOption(int option) {
        double amount;

        switch (option) {

            case 1:
                System.out.print( "How much do you want to cash out: " );
                amount = input.nextDouble();
                cashOut( amount );

                break;

            case 2:
                System.out.print( "How much do you want deposit: " );
                amount = input.nextDouble();
                makeDeposit( amount );
                break;

            case 3:
                System.out.print( "Goodbye!" );
                break;

            default: {
                System.out.println( "Unrecognized. Try again" );
                break;

            }


        }
    }
}
