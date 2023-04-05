package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateForShapesTest {

    CalculateForShapes calculator = new CalculateForShapes();
    Square squareObj = new Square("Square", 3);
    Rectangle rectangleObj = new Rectangle("Rectangle", 4, 3);


@Test
    void calculateTheSumForParameters(){
    calculator.addShape(squareObj);
    calculator.addShape(rectangleObj);
    int sum = calculator.totalSumForPerimeter();
    assertEquals(26,sum );
}
@Test
void calculateTheSumForSurface(){
    calculator.addShape(squareObj);
    calculator.addShape(rectangleObj);
    int sum = calculator.totalSumForSurface();
    assertEquals(18,sum );
}
}