class CM {
static int sum = 0;
static int cm;

public static void calcCM() {

for (int i=1; i<101; i++) {
cm = 15*i;
sum = sum + cm;
}
System.out.println(sum);
}
public static void main(String[] args) {
calcCM();

}
}