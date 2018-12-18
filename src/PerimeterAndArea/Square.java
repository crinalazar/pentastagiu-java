package PerimeterAndArea;

public class Square extends MainClass{

    float width;


    public Square() {

        this.width = 20;
    }

    public Square(float width) {

        this.width = width;
        //System.out.println(getSquareArea( width ) + "has perimeter of " + getSquarePerimeter(width));
    }

    public static float getSquarePerimeter(float width) {
        float P = width * 4;
        return P;
    }
    public static float getSquareArea(float width) {
        float A = width * width;
        return A;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                '}';
    }
}
