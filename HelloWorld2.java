package com.sd.Hello;    //��Ű���� �������� ����� �ٸ���
                         //javac -d classes -sourcepath src src\com\sd\Hello\HelloWorld.java
                         //java -classpath classes com.sd.Hello.HelloWorld

public class HelloWorld2 {
  public void hello() {
    System.out.println("Hello World from hello()");
  }
  public void hello(String name) {     //�Լ� �̸��� ���� ���ڰ� �ٸ��� - overwriting    
    System.out.printf("Hello %s!", name);                                //�Լ� �̸��� �ٸ��� ���ڰ� ���� - overroading
  }            
  public static void main(String[] args) {   // String�� ���ڰ� �� ���� ���� ���� ����Ÿ���� �� �� ����.
    System.out.println("Hello World");
  }
}