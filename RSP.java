class RSP {
static int a;
static int b;

static String A;
static String B; 

public static void select() {
a = (int) (Math.random()*3);
b = (int) (Math.random()*3);

if (a==0) {A = "Rock";}
else if (a==1) {A="Scissors";}
else if (a==2) {A="Paper";}

if (b==0) {B="Rock";}
else if (b==1) {B="Scissors";}
else if (b==2) {B ="Paper";}
System.out.printf("A shows %s\n",A);
System.out.printf("B shows %s\n",B);
}

public static void game() {
if (a==b) {System.out.println("Draw");}
else if (a==0 && b==1) {System.out.println("A won.");}
else if (a==1 && b==2) {System.out.println("A won.");}
else if (a==2 && b==0) {System.out.println("A won.");}
else if (a==0 && b==2) {System.out.println("B won.");}
else if (a==1 && b==0) {System.out.println("B won.");}
else if (a==2 && b==1) {System.out.println("B won.");}
}

public static void main (String[] args) {
select();
game();
}

}