import java.util.*;

interface functionalinterfaceeg
{
int add(int a,int b);
}

class lambdaexpressioneg 
{
public static void main(String args[])
{
functionalinterfaceeg d=(a,b) ->{
return (a+b);
//System.out.println("I am functional interface implemented by labda expression");
};
//d.add();
System.out.println(d.add(40,50));
}
}