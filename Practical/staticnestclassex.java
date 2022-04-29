import java.util.*;
public class staticnestclassex
{
static int a=35;
private static int b=45;
static class inner
{
static int res;
static void show()
{
System.out.println("Value of res : "+(a+b));
}
}
public static void main(String args[])
{
staticnestclassex.inner.show();
}
}