import java.util.*;  
class reverse
{  
static String reversestr(String x)  
{  
String r="";  
for(int i=x.length();i>0;--i)         
{  
r=r+(x.charAt(i-1));   
}  
return r;  
}  
}  
class reversestring
{
public static void main(String[] arg)  
{  
reverse r=new reverse();  
Scanner s=new Scanner(System.in);  
System.out.print("Enter a string: ");  
String  st=s.nextLine();    
System.out.println("Reverse of a String  is : "+r.reversestr(st));          
}  
}