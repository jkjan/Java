import ch.aplu.turtle.*;
 
public class MakeSwirlSquare{
static Turtle t1=new Turtle();
public static void makeSwirlSquare(int size,int bigger,int turns,double degree){
int nBigger=2;
for(int i=0;i<turns;i++){

if(i%nBigger!=0){
size+=bigger;
}

t1.fd(size);
t1.rt(degree);
}
}
 
public static void main(String[] args){
makeSwirlSquare(50,30,20,40.0);
}
}	 