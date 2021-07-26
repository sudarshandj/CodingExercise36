package com.java;

public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius < 0){
            this.radius = 0;
        }else{
            this.radius = radius;
        }
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        double PI = Math.PI;
        return (radius * radius * PI);
    }
}
