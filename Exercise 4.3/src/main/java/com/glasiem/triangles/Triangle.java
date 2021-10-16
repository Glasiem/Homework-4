package com.glasiem.triangles;

public abstract class Triangle {
    protected double a,b, angle;

    public Triangle(double a, double b, double angle) {
        this.a = a;
        this.b = b;
        this.angle = angle;
    }

    public abstract void CalculateSquare();

    public abstract void CalculatePerimeter();
}
