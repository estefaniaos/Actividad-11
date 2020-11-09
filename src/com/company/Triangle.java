package com.company;

public class Triangle implements Shape{
    double base;
    double height;
    double [] sides = new double[3];

    public void Triangle(){
        this.base = 0;
        this.height = 0;
    }

    public void setAreaAttributes(double b, double h){
        this.base = b;
        this.height = h;
    }

    public void setPerimeterAttributes(double[] s){

        for (int i = 0; i < 3; i++) {
            this.sides[i] = s[i];
        }
    }

    public double getArea() {
        double area;

        area = (this.base*this.height)/2;

        return area;
    }

    public double getPerimeter() {
        double perimeter = 0;

        for (int i = 0; i < this.sides.length; i++) {
            perimeter = perimeter+this.sides[i];
        }

        return perimeter;
    }
}
