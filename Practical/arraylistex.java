import java.util.ArrayList;
import java.util.List;

public class arraylistex
{
public static void main(String args[])
{
List<String>al=new ArrayList<String>();
al.add("Rose");
al.add("Sunflower");
al.add("Rose");
al.add(0,"Lily");
al.add(2,"Daisy");
al.add("Marigold");
al.add(6,"Tupil");
al.add("Jasmine");
al.add("Orchid");
al.add("Lotus");
al.add(5,"Lavender");
System.out.println(al);
System.out.println("The length of the array : "+al.size());
al.remove(5);
System.out.println(al);
System.out.println("The length of the array : "+al.size());
System.out.println("The element in that position is : "+al.get(6));
}
}