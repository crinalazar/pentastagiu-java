package PerimeterAndArea;

public class Triangle {

    double a;
    double b;
    double c;

    Triangle() {
        this.a = 50;
        this.b = 18;
        this.c = 75;
    }

    Triangle ( double a,double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        //System.out.println(getTriangleArea( a, b, c ) + "has perimeter of " + getTrianglePerimeter(a, b, c));

    }

    public static double getTrianglePerimeter(double a, double b, double c) {
        double P = a + b + c;
        return P;
    }
    public static double getTriangleArea(double a, double b, double c) {
        double sp =  (a + b + c )/ 2;
        double A =  Math.sqrt (sp * (sp - a) * (sp - b) * (sp - c));
        return A;
    }

    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
