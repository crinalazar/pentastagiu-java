package PerimeterAndArea;

public class Circle extends MainClass{
    double r;

    Circle () {
        double r = 5;
    }

    Circle (double r) {
        this.r = r;


        //System.out.println(getCircleArea( r) + "has perimeter of " + getCirclePerimeter(r));

    }

    public static double getCirclePerimeter(double r) {
        double P = 2 * Math.PI * r ;
        return P;
    }
    public static double getCircleArea(double r) {
        double A = Math.PI * r * r;

        return A;
    }

    public String toString() {
        return "Circle{" + "r=" + r + '}';

        }


    }

