class backwards {

static void illionare() {
String hello = "hello";

char[] chArr = hello.toCharArray();
//���ڸ� ���� �ϳ��ϳ� �迭�� ����.

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
