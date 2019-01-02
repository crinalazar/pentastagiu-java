package StrategyGame;

public class Human extends Characters implements Controlable {

private static int loseHealth = 10;
private static int loseEnergy = 5;

    Human (String name, int healthPoints, int energyPoints, double xPos, double yPos) {
        super(name, healthPoints, energyPoints, xPos, yPos );

    }

    @Override
    public void makeAttack(Characters character) {

        double distanceX ;
        distanceX = Math.abs(character.getxPos()) -Math.abs( getxPos());
        double distanceY ;
        distanceY = Math.abs(character.getyPos()) -Math.abs( getyPos() );
        if ( Math.abs(distanceX) > 5 ||Math.abs( distanceY) > 5) {
            System.out.println("\n" + getName() + " is too far to make the attack on "+ character.getName());
        }
        else if (character.healthPoints == 0) {
            System.out.println("\n" + character.getName() + " is already dead.");
        }
        else{
            energyPoints -= loseEnergy;
            character.healthPoints -= loseHealth;
           }
    }
}
