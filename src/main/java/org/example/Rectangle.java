package org.example;

public class Rectangle extends Shape {
    Integer length;
    Integer width;
    String name;




    public Rectangle(String name,Integer length, Integer width) {

        this.length = length;
        this.width = width;
        this.name = name;

    }

    @Override
    public Integer theSurface() {
        int surface = length * width;
        return surface;
    }

    @Override
    public Integer thePerimeter() {
        int perimeter = 2 * length + 2 * width;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Length " + length + " width "+ width;
    }
}
