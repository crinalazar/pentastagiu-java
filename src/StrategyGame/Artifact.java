package StrategyGame;

public enum Artifact {

    ENERGY ( 5, 6.5, 5 ),
    HEALTH ( 10, 3,1.5 );

    private int extraPoints;
    private double xPos;
    private double yPOs;

    Artifact(int extraPoints, double xPos, double yPos) {
        this.extraPoints = extraPoints;
        this.xPos = xPos;
        this.yPOs = yPos;
    }

    public int getExtraPoints() {
        return extraPoints;
    }

}






