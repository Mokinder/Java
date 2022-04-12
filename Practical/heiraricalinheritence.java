class metal
{
double weight=30.5;
String color="brown";
}
class gold extends metal
{
int hue=22;
}
class silver extends metal
{
int luster=15;
}
class heiraricalinheritence
{
public static void main(String args[])
{
gold g=new gold();
silver s=new silver();
System.out.println("Metal weight in gold is : "+g.weight);
System.out.println("Color of the metal added with gold is : "+g.color);
System.out.println("The hue in gold is : "+g.hue);
System.out.println("Metal Weight in silver is : "+s.weight);
System.out.println("Color of the metal added with silver is  : "+g.color);
System.out.println("the luster in silver is : "+s.luster);
}
}