class multiarrayex
{
public void display()
{
int ar[][]={{1,2,3},{4,5,6},{7,8,9}};
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.println(ar[i][j]+" ");
}
System.out.println();
}
}
public static void main(String args[])
{
multiarrayex m=new multiarrayex();
m.display();
}
}