package com.sd.ch8;
public class Circle2 extends Shape2{
	private double radius;
	private double area;
	private double perimeter;
	
	public Circle2(double radius){
		this.radius=radius;
		this.area=Math.PI*radius*radius;
		this.perimeter=2*Math.PI*radius;
	}
	
	public double calcArea(){
		return this.area;
	}
	
	public double calcPerimeter(){
		return this.perimeter;
	}
	
	public String toString(){
		return "Circle "+super.toString();
	}
	
}