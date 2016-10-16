package com.sd.Hello;    //패키지는 컴파일이 방법이 다르다
                         //javac -d classes -sourcepath src src\com\sd\Hello\HelloWorld.java
                         //java -classpath classes com.sd.Hello.HelloWorld

public class HelloWorld2 {
  public void hello() {
    System.out.println("Hello World from hello()");
  }
  public void hello(String name) {     //함수 이름이 같고 인자가 다르다 - overwriting    
    System.out.printf("Hello %s!", name);                                //함수 이름이 다르고 인자가 같다 - overroading
  }            
  public static void main(String[] args) {   // String은 문자가 몇 개가 들어갈지 몰라서 원시타입이 될 수 없다.
    System.out.println("Hello World");
  }
}