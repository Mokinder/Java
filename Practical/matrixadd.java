import java.util.*;

class matrixadd
{
void madd()
{
int i,j;
int a[][]={{1,2,3},{4,5,6},{7,8,9}};
int b[][]={{1,2,3},{4,5,6},{7,8,9}};
int r[][] =new int[3][3];
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
r[i][j]=a[i][j]+b[i][j];
}
}
System.out.println("The Addition of two Matrixs is :");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(r[i][j]+" ");
}
System.out.println();
}
}
public static void main(String args[])
{
matrixadd md=new matrixadd();
md.madd();
}
}