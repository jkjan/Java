package com.j4;
import ch.aplu.turtle.*;
import java.awt.geom.Point2D;
public abstract class p4_DrawTurtleAt {
static Turtle t1=new Turtle();  
                                  
public p4_DrawTurtleAt() {};   
public static void drawAt(int size, double x, double y) {
t1.setPos(x,y);
for(int i=0; i<4; i++) {
t1.fd(size);
t1.rt(90);
}
}
public static void main(String[] args) {
drawAt(100,20.0,20.0);
System.out.println(t1.getX());
System.out.println(t1.getY());
}
}