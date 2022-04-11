import java.util.*;

class Factorial 
{
void fac(int num)
{
int factorial = 1;
 for(int i = 1; i <= num; ++i)
 {
     factorial *= i;
 }
 System.out.printf("Factorial of %d = %d", num, factorial);
}
 public static void main(String args[])
{
 int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number : ");
n=s.nextInt();
Factorial f=new Factorial();
f.fac(n);
}
}