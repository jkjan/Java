package com.j3;
import ch.aplu.turtle.*;
public class p3_TurtleStar {
static Turtle t1=new Turtle();  
public p3_TurtleStar() {};   
public static void drawStar(int size) {
for(int i=0; i<5; i++) {
t1.fd(size);
t1.rt(144);
}
}
public static void main(String[] args) {
drawStar(100);
}
}