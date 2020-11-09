package com.company;

public class Square implements Shape {

    double side;

    public void Square(){
        this.side = 0;
    }

    public void setAttributes(double l) {
        this.side = l;
    }

    public double getArea() {
        double area;

        area = this.side * this.side;

        return area;
    }

    public double getPerimeter() {
        double perimeter;

        perimeter = this.side * 4;

        return perimeter;
    }


}
