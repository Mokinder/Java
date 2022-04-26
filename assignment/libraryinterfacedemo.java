import java.util.*;

interface libraryuser
{
void registeraccount(int a);
void requestbook(String a);

}

class kidusers implements libraryuser
{
int age;
String booktype;

public void registeraccount(int a)
{
age=a;
if(age<12)
{
System.out.println("Sorry,Age must be less than 12 to registrer as a kid..");
}
}

public void requestbook(String a)
{
booktype=a;
if(booktype =="kids")
{
System.out.println("Book Issued successfully,please return the book within 10 days..");
}
}
}

class adultusers implements libraryuser
{
int age;
String booktype;

public void registeraccount(int a)
{
age=a;
if(age>12)
{
System.out.println("You have successfully Registered under an Adult Account..");
}
else
{
System.out.println("Sorry, Age must be greater than 12 to register as an adult..");
}
}

public void requestbook(String a)
{
booktype =a;
if(booktype =="Fiction")
{
System.out.println("Book Issued successfully,please return the book within 7 days..");
}
else
{
System.out.println("Ooops,you are allowed to take any adult Fiction books..");
}
}
}

class libraryinterfacedemo
{

public static void main(String args[])
{
kidusers ku=new kidusers();
adultusers au=new adultusers();
ku.registeraccount(10);
ku.registeraccount(18);
ku.requestbook("kids");
ku.requestbook("Fiction");
au.registeraccount(5);
au.registeraccount(23);
au.requestbook("kids");
au.requestbook("Fiction");
}
}