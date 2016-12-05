package com.sd.ch8;
public abstract class Shape2{
	public String name="Shape";
	public abstract double calcArea();
	public abstract double calcPerimeter();
	
	public String getName(){
		return this.name;
	}
	
	public String toString(){
		return "Shape..."+super.toString();
	}
	
	public static void main(String[] args){
		Rectangle2 r=new Rectangle2(3,4);
		Circle2 c=new Circle2(5);
		System.out.println("Reactagle size is "+r.calcArea());
		System.out.println("Cicle size is "+c.calcArea());
		
	}
}