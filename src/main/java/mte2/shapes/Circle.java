// Question: Q1 (mte2, gcis124, 2255)
// Package name: shapes
// File name: Circle.java

package mte2.shapes;


public class Circle implements Shape {
    
    private final double radius;
    public Circle(double radius) {    
        this.radius = radius;    
    }

    @Override
    public double perimeter() {
        return Math.PI * 2 * radius;
    }
    
    @Override
    public double area() {
        return Math.PI * (Math.pow(radius, 2));
    }
    public static void main(String[] args) {
        
        Shape circle = new Circle(5);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());

    }
}