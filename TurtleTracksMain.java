import ch.aplu.turtle.*;

public class TurtleTracksMain{
static void drawSquareFrom(double[][] track){
Turtle t1=new Turtle();
for(double[] t:track){
t1.moveTo(t[0],t[1]);
}
}
  
public static void main(String[] args){
double[][]
track={{0,0},{0,100},{100,100},{100,0},{0,0}};
new TurtleTracksMain().drawSquareFrom(track);
}
}