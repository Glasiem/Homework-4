package com.glasiem.triangles;

public class RightAngledTriangle extends Triangle{

    public RightAngledTriangle(double a, double b) {
        super(a, b, Math.toRadians(90));
    }

    @Override
    public void CalculateSquare() {
        System.out.println(0.5*a*b);
    }

    @Override
    public void CalculatePerimeter() {
        System.out.println(a+b+Math.sqrt(a*a+b*b));
    }
}
