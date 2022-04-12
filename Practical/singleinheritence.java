class Vehicle
{
String type="4-Wheeler";
String brand="Ford";
}

class car extends Vehicle
{
String modelname="abc123";
}

class singleinheritence
{
public static void main(String args[])
{
car c=new car();
System.out.println("Car Brand is : "+c.brand);
System.out.println("Car Model is : "+c.modelname);
}
}

