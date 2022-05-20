import java.util.*;
import java.util.PriorityQueue;

class priorityqueueex
{
public static void main(String args[])
{
PriorityQueue<String> qu =new PriorityQueue<String>();
qu.add("Ram");
qu.add("Karan");
qu.add("mamta");
qu.add("Sam");
qu.add("Priya");
qu.add("Ajay");

System.out.println("peek element "+qu.peek());
Iterator itr=qu.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
qu.remove();
System.out.println("queue after removing an element ");
Iterator itr1=qu.iterator();
while(itr1.hasNext())
{
System.out.println(itr1.next());
}
}
}