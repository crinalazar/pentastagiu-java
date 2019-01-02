package StrategyGame;

public class Characters implements Controlable {

    private String name;
    protected int healthPoints;
    protected int energyPoints;
    private double xPos;
    private double yPos;

    Characters(String name, int healthPoints, int energyPoints, double xPos, double yPos) {
        this.energyPoints = energyPoints;
        this.healthPoints = healthPoints;
        this.name = name;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    Characters(String name, int healthPoints, double xPos, double yPos) {
        this.healthPoints = healthPoints;
        this.name = name;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public String getName() {
        return name;
    }


    public double getxPos() {
        return xPos;
    }

    public double getyPos() {
        return yPos;
    }

    @Override
    public String toString() {
        return "{name='" + name + '\'' +
                ", healthPoints=" + healthPoints +
                ", energyPoints=" + energyPoints + '}';
    }

    @Override
    public void getPosition() {
        System.out.println( name + " is at: X-Position: " + xPos + " and " + "Y-Position: " + yPos );
    }

    @Override
    public void makeAttack(Characters character) {

    }

    public void increasePoints(Artifact artifact) {

        switch (artifact) {
            case ENERGY: {
                energyPoints += artifact.getExtraPoints();
                break;
            }
            case HEALTH: {
                healthPoints += artifact.getExtraPoints();
                break;
            }

        }



    }
}
