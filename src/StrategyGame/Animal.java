package StrategyGame;

public class Animal extends Characters implements Controlable{

    Animal (String name, int healthPoints, double xPos, double yPos) {
        super(name, healthPoints, xPos, yPos );
    }

    @Override
    public void makeAttack(Characters character) {
        System.out.println("\n" + "Animals cannot attack!");
    }


}
