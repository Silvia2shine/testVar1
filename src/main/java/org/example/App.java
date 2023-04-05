package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Rectangle");


        Rectangle rectangleObj = new Rectangle("Rectangle", 4, 3);

        System.out.println("The surface is: " + rectangleObj.theSurface());
        System.out.println("The perimeter is: " + rectangleObj.thePerimeter());

        Square squareObj = new Square("Square", 3);

        System.out.println("Square " + squareObj.length + " ");
        System.out.println("The surface of the square " + squareObj.theSurface());

        CalculateForShapes calculator = new CalculateForShapes();

        calculator.addShape((rectangleObj));
        calculator.addShape(squareObj);
        calculator.addShape((rectangleObj));


        System.out.println(calculator);


        System.out.println("Total sum for param : " + calculator.totalSumForPerimeter());

        System.out.println("Total sum for surface : " + calculator.totalSumForSurface());
    }


}




