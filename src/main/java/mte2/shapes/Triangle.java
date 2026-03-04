// Question: Q1 (mte2, gcis124, 2255)
// Package name: shapes
// File name: Triangle.java

package mte2.shapes;

public class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA,double sideB,double sideC) { this.sideA = sideA; this.sideB = sideB; this.sideC = sideC; }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
    
    public double area() {    
        double s = perimeter()  / 2;  // (a + b + c) divided by 2
        double product = (s) * ((s-sideA)* (s-sideB) * (s-sideC)); // s times (s-a)(s-b)(s-c)
        return Math.sqrt(product); //not sure why perimeter returning 0 shouldve been square root of product above 
    }

    public static void main(String[] args) {
        Shape tri = new Triangle(10.0, 20.0, 30.0);
        System.out.println(tri.perimeter());
        System.out.println(tri.area());

    }
}