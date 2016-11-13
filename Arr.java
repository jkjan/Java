package com.sd.array;
import java.util.ArrayList;
class Arr{
static int sum = 0;
static void arr() {
ArrayList<Integer> asa = new ArrayList<Integer>();
for (int i =0; i<1001; i++) {
if ((i %4 == 0) && (i%5 != 0)) {
asa.add(i);
sum = sum + i;
}
}
System.out.println(asa);
System.out.println('\n');
System.out.println(sum);
}

public static void main(String[] args) {
new Arr().arr();
}
}
