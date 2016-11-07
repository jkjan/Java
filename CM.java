class CM {
static int sum = 0;

public static void calcCM() {

for (int i=1; i<101; i++) {
sum = sum + 3*i + 5*i;
sum = sum - 15*i;
}
System.out.println(sum);
}
public static void main(String[] args) {
calcCM();

}
}