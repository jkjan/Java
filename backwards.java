class backwards {

static void illionare() {
String hello = "hello";

char[] chArr = hello.toCharArray();
//문자를 문자 하나하나 배열로 넣음.

StringBuilder olleh = new StringBuilder();

for(int i = chArr.length; i>=0; i--) {
olleh.append(chArr[i]);
}
System.out.println(olleh);
}

public static void main(String[] args) {

illionare();
}

}
