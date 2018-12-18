package PerimeterAndArea;

public class MainClass {

    public static void main(String[] args) {


        Square customSquare = new Square( 15 );
        Square customSquare1 = new Square( 20 );
        Square customSquare2 = new Square( 5 );
        double custSqrArea = Square.getSquareArea( customSquare.width );
        double custSqrArea1 = Square.getSquareArea( customSquare1.width );
        double custSqrArea2 = Square.getSquareArea( customSquare2.width );

        Rectangle customRectangle = new Rectangle( 20, 10 );
        Rectangle customRectangle1 = new Rectangle( 8, 6 );
        Rectangle customRectangle2 = new Rectangle( 15, 9 );
        double custRectangArea = Rectangle.getRectangleArea( customRectangle.width, customRectangle.length );
        double custRectangArea1 = Rectangle.getRectangleArea( customRectangle1.width, customRectangle1.length );
        double custRectangArea2 = Rectangle.getRectangleArea( customRectangle2.width, customRectangle2.length );

        Triangle customTriangle = new Triangle( 10, 20, 28 );
        Triangle customTriangle1 = new Triangle( 55, 50, 87 );
        Triangle customTriangle2 = new Triangle( 40, 15, 31 );
        double custTriangArea = Triangle.getTriangleArea( customTriangle.a, customTriangle.b, customTriangle.c );
        double custTriangArea1 = Triangle.getTriangleArea( customTriangle1.a, customTriangle1.b, customTriangle1.c );
        double custTriangArea2 = Triangle.getTriangleArea( customTriangle2.a, customTriangle2.b, customTriangle2.c );

        Circle customCircle = new Circle( 10 );
        Circle customCircle1 = new Circle( 25 );
        Circle customCircle2 = new Circle( 36 );
        double custCircArea = Circle.getCircleArea( customCircle.r );
        double custCircArea1 = Circle.getCircleArea( customCircle1.r );
        double custCircArea2 = Circle.getCircleArea( customCircle2.r );

        System.out.println( "Max area for the circle is: " + getMaxCircle(custCircArea, custCircArea1, custCircArea2));

        if (getMaxCircle( custCircArea, custCircArea1, custCircArea2 ) == custCircArea)
            System.out.println(customCircle.toString());
        if (getMaxCircle( custCircArea, custCircArea1, custCircArea2 ) == custCircArea1)
            System.out.println(customCircle1.toString());
        if (getMaxCircle( custCircArea, custCircArea1, custCircArea2 ) == custCircArea2)
            System.out.println(customCircle2.toString());

        System.out.println( "Max area for the triangle is: " + getMaxTriang(custTriangArea, custTriangArea1, custTriangArea2));

        if (getMaxTriang( custTriangArea, custTriangArea1, custTriangArea2 ) == custTriangArea)
            System.out.println(customTriangle.toString());
        if (getMaxTriang( custTriangArea, custTriangArea1, custTriangArea2 ) == custTriangArea1)
            System.out.println(customTriangle1.toString());
        if (getMaxTriang( custTriangArea, custTriangArea1, custTriangArea2 ) == custTriangArea2)
            System.out.println(customTriangle2.toString());

        System.out.println( "Max area for the rectangle is: " + getMaxRectang(custRectangArea, custRectangArea1, custRectangArea2));

        if (getMaxRectang( custRectangArea, custRectangArea1, custRectangArea2 ) == custRectangArea)
            System.out.println(customRectangle.toString());
        if (getMaxRectang( custRectangArea, custRectangArea1, custRectangArea2 ) == custRectangArea1)
            System.out.println(customRectangle1.toString());
        if (getMaxRectang( custRectangArea, custRectangArea1, custRectangArea2 ) == custRectangArea2)
            System.out.println(customRectangle2.toString());

        System.out.println( "Max area for the square is: " + getMaxSqr(custSqrArea, custSqrArea1, custSqrArea2));

        if (getMaxSqr( custSqrArea, custSqrArea1, custSqrArea2 ) == custSqrArea)
            System.out.println(customSquare.toString());
        if (getMaxSqr( custSqrArea, custSqrArea1, custSqrArea2 ) == custSqrArea1)
            System.out.println(customSquare1.toString());
        if (getMaxSqr( custSqrArea, custSqrArea1, custSqrArea2 ) == custSqrArea2)
            System.out.println(customSquare2.toString());

        }

        public static double getMaxCircle(double custCircArea, double custCircArea1, double custCircArea2) {
            double max = custCircArea;
            if (custCircArea1 > max)
                max = custCircArea1;
            if (custCircArea2 > max)
                max = custCircArea2;
            return max;
        }
    public static double getMaxTriang(double custTriangArea, double custTriangArea1, double custTriangArea2) {
        double max = custTriangArea;
        if (custTriangArea1 > max)
            max = custTriangArea1;
        if (custTriangArea2 > max)
            max = custTriangArea2;
        return max;
    }
    public static double getMaxRectang(double custRectangArea, double custRectangArea1, double custRectangArea2) {
        double max = custRectangArea;
        if (custRectangArea1 > max)
            max = custRectangArea1;
        if (custRectangArea2 > max)
            max = custRectangArea2;
        return max;
    }
    public static double getMaxSqr(double custSqrArea, double custSqrArea1, double custSqrArea2) {
        double max = custSqrArea;
        if (custSqrArea1 > max)
            max = custSqrArea1;
        if (custSqrArea2 > max)
            max = custSqrArea2;
        return max;
    }
    }








