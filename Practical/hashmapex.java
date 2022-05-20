import java.util.*;

class hashmapex
{
public static void main(String args[])
{
HashMap<Integer,String> map=new HashMap<Integer,String>();
map.put(101,"Mango");
map.put(102,"Orange");
map.put(103,"Banana");
map.put(104,"Grapes");
map.put(105,"Banana");
map.put(null,null);
map.put(102,null);
map.putIfAbsent(102,"CustardApple");
map.putIfAbsent(101,"Watermelon");

for(Map.Entry m: map.entrySet())
{
System.out.println(m.getKey()+" "+m.getValue());
}

map.remove(103);
System.out.println("After Removal");
for(Map.Entry m : map.entrySet())
{
System.out.println(m.getKey()+" "+m.getValue());
}
}
}