interface sample
{
void display(String a);

default void display1()
{
System.out.println("I am display1 method");
}

static void my()
{
System.out.println("I am static my function");
}
//void abc();

}

public class defaultmethodeg implements sample
{
public static void main(String args[])
{
defaultmethodeg d=new defaultmethodeg();
d.display("Good morning");
d.display1();
sample.my();
}

public void display(String a )
{
System.out.println(a);
}
}