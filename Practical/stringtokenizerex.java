import java.util.*;
public class stringtokenizerex
{
public void myy()
{
StringTokenizer t=new StringTokenizer("Anudip Foundation skill and career development center");
while(t.hasMoreTokens())
{
System.out.println(t.nextToken());
}
StringTokenizer st= new StringTokenizer("I am mamta,Staying in mumbai,working in annudip");
while(st.hasMoreTokens())
{
System.out.println("Next Token :"+st.nextToken(","));
}
}

public static void main(String args[])
{
stringtokenizerex m =new stringtokenizerex();
m.myy();
}
}