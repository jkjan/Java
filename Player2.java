public class Player2 {
private String name=null;
int num=0;
public Player(String _name) {
name=_name;
}
public void play() {
dice d=new dice();
for(int i=0; i<10;i++)
d.roll();
num=d.getNum();
}
public String getName() {
return this.name;
}
public int getNum() {
return this.num;
}
}