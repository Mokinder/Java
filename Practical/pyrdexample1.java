import java.util.*;

class pyrdexample1
{
public static void main(String args[])
{
int rw=5,j=0;
for(int i=1;i<=rw;++i,j=0)
{
for(int s=1;s<=rw-1;++s)
{
System.out.println(" ");
}
while(j!=2*i-1)
{
System.out.print(" * ");
++j;
}
System.out.println();
}
}
}
