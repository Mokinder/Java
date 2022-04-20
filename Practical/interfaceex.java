interface car
{
void service();
void refuel();
}

class bmw implements car {
public void service()
{
System.out.println("Service Time..");
}
public void refuel()
{
System.out.println("Tank is empty..pls..refuel it..!!");
}
public void petrol()
{
 System.out.println("Petrol");
}
}

class interfaceex
{
public static void main(String args[])
{
bmw b=new bmw();
car c=new bmw();
b.service();
b.refuel();
c.service();
c.refuel();
b.petrol();
}
}