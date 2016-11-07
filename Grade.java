class Grade {

public static void WhichGrade(double score) {
if (score > 100) {System.out.println("The score must be lower than 100.");} 
else if (score >= 90) {System.out.println("A");}
else if (score >= 80) {System.out.println("B");}
else if (score >= 70) {System.out.println("C");}
else if (score >= 60) {System.out.println("D");}
else {System.out.println("F");}

}

public static void main(String[] args) {
WhichGrade(75.2);
}

}