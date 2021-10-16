package com.glasiem.triangles;

public class IsoscelesTriangle extends Triangle {


    public IsoscelesTriangle(double a, double angle) {
        super(a, a, Math.toRadians(angle));
    }

    @Override
    public void CalculateSquare() {
        System.out.println(0.5*a*a*Math.sin(angle));
    }

    @Override
    public void CalculatePerimeter() {
        System.out.println(a+a+2*a*Math.sin(angle));
    }
}
