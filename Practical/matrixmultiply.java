import java.util.*;

class matrixmultiply
{
void multi()
{
int i,j,k;
int a[][]={{1,2,3},{4,5,6},{7,8,9}};
int b[][]={{1,2,3},{4,5,6},{7,8,9}};
int r[][] =new int[3][3];
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
for(k=0;k<3;k++)
{
r[i][j]+=a[i][k]*b[k][j];
}
}
}
System.out.println("The multiplication of two Matrixs is :");
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
matrixmultiply mm=new matrixmultiply();
mm.multi();
}
}