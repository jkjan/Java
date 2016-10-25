package com.j2;
import ch.aplu.turtle.*;
public class p2_TurtleTriangle {
static Turtle t1=new Turtle();  
                                 
public p2_TurtleTriangle() {};   
public static void drawTriangle(int size) {
for(int i=0; i<3; i++) {
t1.fd(size);
t1.rt(120);
}
}
public static void main(String[] args) {
drawTriangle(100);
}
}