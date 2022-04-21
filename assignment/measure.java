import java.util.*;

abstract class  shape
{
int sd;
Scanner s=new Scanner(System.in);
abstract void getarea();
void getsides()
{ 
System.out.println("Enter the no of sides : ");
sd=s.nextInt();
}
}

class rectangle extends shape
{
int l,b,area;
void getarea()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the length of the rectangle : ");
l=s.nextInt();
System.out.println("Enter the breath of the rectangle : ");
b=s.nextInt();
area=l*b;
System.out.println("Area of the Rectangle is : "+area);
}
void getsides()
{
System.out.println("Rectangle has 4 sides ");
}
}

class triangle extends shape
{
int b,h;
float area;
void getarea()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the base of the triangle : ");
b=s.nextInt();
System.out.println("Enter the height of the triangle : ");
h=s.nextInt();
area=0.5f*b*h;
System.out.println("Area of the Triangle is : "+area);
}

void getsides()
{
System.out.println("Triangle has 3 sides ");
}
}

class square extends shape
{
int x,area;
void getarea()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the length of the Square : ");
x=s.nextInt();
area=x*x;
System.out.println("Area of the Square is : "+area);
}

void getsides()
{
System.out.println("Square has 4 sides ");
}
}

class measure
{
public static void main(String args[])
{
rectangle r=new rectangle();
triangle t=new triangle();
square sq=new square();
r.getarea();
r.getsides();
t.getarea();
t.getsides();
sq.getarea();
sq.getsides();
}
}