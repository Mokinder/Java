import java.util.*;

class prime
{

 int pr(int num)
{
int i, flag = 0;
for(i = 2; i<= num / 2; i++)
{
    if(num % i == 0)
    {
        flag = 1;
        break;
    }
}
if(flag == 0)
    return 1;
else
    return 0;
}

void alternatenos(int n)
{
int c = 0;
for(int num = 2; num < n; num++)
{
    if (pr(num) == 1)
    {
        if (c % 2 == 0)
        {
            System.out.print(num + " ");
        }         
        c ++;
    }
}
}
}

class primeno
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the last element : ");
n=s.nextInt();
prime p=new prime();
System.out.println("The alternate Prime numbers till "+n+" are :");
p.alternatenos(n);
}
}





