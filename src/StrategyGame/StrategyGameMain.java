package StrategyGame;

public class StrategyGameMain {

    public static void main(String[] args) {

        Characters human = new Human( "Damian",50,20,6.5,4);
        Characters animal = new Animal( "Roger",50,5,7.5 );
        Characters monster = new Monster( "Devon",50,20,8.5,8 );
        Characters human2 = new Human( "John", 50, 20, 9,10 );
        Artifact artf1 = Artifact.ENERGY.setArtifactPos( 5.5,9 );
        Artifact artf2 = Artifact.HEALTH.setArtifactPos( 8,3.5 );


        human.getPosition();
        monster.getPosition();
        animal.getPosition();
        human2.getPosition();
        human.makeAttack( animal );
        monster.makeAttack( human );
        human.makeAttack( monster );
        human.makeAttack( human2 );
        human.increasePoints( artf1);
        monster.increasePoints( artf2);
        animal.makeAttack( human );
        monster.makeAttack( animal );
        monster.makeAttack( human2 );
        human2.makeAttack( monster );
        System.out.println("\n" + "Status:");
        System.out.println(human.toString());
        System.out.println(monster.toString());
        System.out.println(animal.toString());
        System.out.println(human2.toString());

    }
}
