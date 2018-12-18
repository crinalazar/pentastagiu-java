package PerimeterAndArea;

public class Rectangle extends MainClass {

    float width;
    float length;

    Rectangle () {
        this.width = 10;
        this.length = 15;
    }

    public Rectangle(float width, float length) {
        this.width = width;
        this.length = length;
        //System.out.println(getRectangleArea( width, length ) + "has perimeter of " + getRectanglePerimeter(width, length));
    }

    public static float getRectanglePerimeter(float width, float length) {
        float P = (width + length) * 2;            return P;
    }

    public static float getRectangleArea(float width, float length) {
        float A = width * length;
        return A;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
