package com.j1;
import ch.aplu.turtle.*;
public class p1_TurtleSquare {
static Turtle t1=new Turtle();  
                                 
public p1_TurtleSquare() {}; 
public static void drawSquare(int size) {
for(int i=0; i<4; i++) {
t1.fd(size);
t1.rt(90);
}
}
public static void main(String[] args) {
drawSquare(100);
}
}