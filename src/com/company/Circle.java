package com.company;

public class Circle implements Shape{
    double radius;

    public void Circle(){
        this.radius = 0;
    }

    public void setAttributes(double r){
        this.radius = r;
    }
    public double getArea() {
        double area;

        area = Math.PI * (this.radius*this.radius);

        return area;
    }

    public double getPerimeter() {
        double perimeter;

        perimeter = Math.PI * (this.radius*2);

        return perimeter;
    }
}
