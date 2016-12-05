package com.sd.ch8;

public class Rectangle2 implements IShape {
  private double width;
  private double height;
  private double area;
  private double perimeter;
  public Rectangle (double w, double h) {
    this.width = w;
    this.height = h;
    this.area = w*h;
    this.perimeter = 2*(w+h);
    }
  public double calcArea() {
    return this.area;
    }
  public double calcPerimeter() {
    return this.perimeter;
    }
}