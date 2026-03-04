// Question: Q1 (mte2, gcis124, 2255)
// Package name: shapes
// File name: Rectangle.java

package mte2.shapes;

public class Rectangle implements Shape {
    
    private final double length;
    private final double width;

    public Rectangle(double length,double width) {  this.length = length;  this.width = width;  }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
    
    @Override
    public double area() {
        return length * width;
    }
    
    public static void main(String[] args) {
        Shape rect = new Rectangle(4, 5);
        System.out.println(rect.area());
        System.out.println(rect.perimeter());
        

    }
    
}