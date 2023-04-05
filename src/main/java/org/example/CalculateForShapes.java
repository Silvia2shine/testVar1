package org.example;

import java.util.ArrayList;
import java.util.List;

public class CalculateForShapes {
    List<Shape> listForShape = new ArrayList<>();

    public void addShape(Shape obj) {

        if (listForShape.contains(obj)) {
            System.out.println("The shape: " + obj + ", already exist. It can be added to the list. ");
        } else {
            listForShape.add(obj);
        }
    }

    public Integer getListOfShapes() {
        for (Shape shape : listForShape)
            return shape.thePerimeter();
        return  getListOfShapes();
    }

    public Integer totalSumForPerimeter(){
        int totalPerimeter = 0;
        for (Shape shape : listForShape) {
           totalPerimeter += shape.thePerimeter();
        }
        return  totalPerimeter;
    }

    public Integer totalSumForSurface(){
        int totalSurface = 0;
        for (Shape shape : listForShape) {
           totalSurface += shape.theSurface();
        }
        return  totalSurface;
    }

    @Override
    public String toString() {
        return "The shapes are: " + listForShape;
    }
}

