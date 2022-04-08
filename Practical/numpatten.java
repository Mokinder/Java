import java.util.*;

class numpatten
{
void patten(int nm)
{
for (int i=1;i<nm;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(j+" ");
}
System.out.println();
}
}
public static void main(String args[])
{
int x;
Scanner s=new Scanner(System.in);
System.out.println("Enter the no :");
x=s.nextInt();
numpatten n =new numpatten();
System.out.println("Output is :");
n.patten(x);
}
}