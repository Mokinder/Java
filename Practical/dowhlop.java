import java.util.*;

class dowhlop
{
void dwh()
{
int n,i=0,j=0,k=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the end number :");
n=s.nextInt();
do
{
if(i%2!=0)
{
  j++;
}
else
{
 k++;
}
i++;
}while(i<=n);
System.out.println("The no of odd numbers till "+n+" is :"+j);
System.out.println("The no of even numbers till "+n+" is :"+k);
}

public static void main(String args[])
{
dowhlop dw=new dowhlop();
dw.dwh();
}
}