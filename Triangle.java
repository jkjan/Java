class Triangle {

public static void triangle() {
String s="*";
StringBuffer sbuf=new StringBuffer();
for(int i=0;i<5;i++) {
    for(int j=0;j<i;j++) {
        sbuf.append(s);
    }
    System.out.printf("%d %s\n",i,sbuf.toString());
    sbuf.delete(0, sbuf.length());
}

}

public static void main(String[] args) {

triangle();
}

}
