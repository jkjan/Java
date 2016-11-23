package com.sd.ch8;
import java.util.ArrayList;
public class Selection {
	ArrayList<Rectangle> sArr=new ArrayList<Rectangle>();
	public Selection() {
	
	}
	public void select(Rectangle r) {
   
		r.setSelected(true);
		sArr.add(r);
		System.out.println("selected"+r.getSelected());
	}
	public void print() {
		for(Rectangle r:sArr)
			System.out.println(r.toString());
	}
	
	
}