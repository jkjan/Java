class Yun {
  public static void guessif(int year) {
    if (((year % 4 == 0) && (year % 100 != 0)) || ((year % 4 == 0) && (year % 400 == 0))) {
    System.out.println("Yun!");
    }
    else {
    System.out.println("just like other years.");
    }
  }
  
public static void main (String[] args) {
guessif(2016);

}
  
}
