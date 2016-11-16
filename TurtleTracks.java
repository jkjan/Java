import ch.aplu.turtle.*;
import java.util.ArrayList;

public class TurtleTracks{      
Turtle t1=new Turtle();
ArrayList<Double[]> posArr = new ArrayList<Double[]>();
Double[] pos=new Double[2];
     
public void drawSquareAtSave(int size,double x, double y){
t1.penUp();
t1.moveTo(x,y);
t1.penDown();
for(int i=0;i<4;i++){
pos[0]=t1.getX();
pos[1]=t1.getY();
posArr.add(pos);
System.out.printf("(%.1f,%.1f)",pos[0],pos[1]);
t1.forward(size);
t1.right(90);
}
}

public static void main(String[] args){
new TurtleTracks().drawSquareAtSave(50,50,50);
}
}