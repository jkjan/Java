class Temperature{
void change(float temp,String sel){
float t;
if (sel.equals("'F")){
t=(temp-32f)/1.8f;
System.out.println("%.1f"+"C",t);
}

else if(sel.equals("'C")){
t=(temp*1.8f)+32;
System.out.println("%.1f"+"F",t);
}

}

public static void main(String[] args){
Temperature t=new Temperature();
t.change(123,"'F");
t.change(45,"'C");
}
} 