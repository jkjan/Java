import java.util.*;
class countletters{

static Map sangmyung(String sang){
char[] myung = sang.toCharArray();
Map<String, Integer> map = new HashMap<String, Integer>();
String s;
for(char c:myung){
s = Character.toString(c);
if(map.containsKey(s)){
map.put(s, map.get(s)+1);
}
else{
map.put(s,1);
}
}
return map;
}

public static void main(String[] args){
String a = "sangmyung university";
Map b = sangmyung(a);
System.out.println(b);
}
}