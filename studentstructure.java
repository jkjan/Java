package students;

import java.util.ArrayList;
import java.util.Collections;

class studentstructure {

public String name;
public int studentNum;
studentstructure(String name, int sNum) {
this.name=name;
this.studentNum=sNum;
}
public String getName() {
return name;
}

public static void main(String[] args) {

ArrayList<String> studentNameList = new ArrayList<String>();

studentstructure s1 = new studentstructure("js 1", 1);
studentstructure s2 = new studentstructure("js 2", 2);
studentstructure s3 = new studentstructure("js 3", 3);


studentNameList.add(s1.getName());
studentNameList.add(s2.getName());
studentNameList.add(s3.getName());
Collections.sort(studentNameList);
System.out.println(studentNameList);
}
}