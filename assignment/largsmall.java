import java.util.*;

class largsmall
{
void lrsm()
{
int lr,sm,i;
int a[] ={1, 2, 3, 4, 5};
int n = a.length;
lr=sm=a[0];
for(i=1;i<n;++i)
{
if(a[i]>lr)
{
lr=a[i];
}
if(a[i]<sm)
{
sm=a[i];
}
}
System.out.println("The Smallest element is : "+sm);
System.out.println("The largest element is : "+lr);
}
public static void main(String args[])
{
largsmall ls= new largsmall();
ls.lrsm();
}
}