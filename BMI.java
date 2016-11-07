class BMI {
static double weight;
static double height;


public static double calcBMI(double weight, double height) {

double Height = (height/100.0);
double BMI;
BMI = weight/(Height*Height);

if (BMI > 40) {System.out.println("obesity 3");}
else if (BMI >= 30) {System.out.println("obesity 2");}
else if (BMI >= 25) {System.out.println("obesity 1");}
else if (BMI >= 23) {System.out.println("risky");}
else if (BMI >= 18.5) {System.out.println("normal");}
else {System.out.println("low");}
return (BMI);
}

public static void main(String[] args) {
calcBMI(50.0, 170.0);

}

}