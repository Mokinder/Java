import java.util.*;
class account
{
private String acname;
private long acnum;
char pros,x;
int amt,bal=10000,t=0,w=0,d=0,f=0;

void inputs()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the Account Holder Name : ");
acname=s.next();
System.out.println("Enter your Account Number : ");
acnum=s.nextInt();
}
void withdr()
{
               Scanner s=new Scanner(System.in);
               System.out.println("Enter the amount to be withdrawed :");
               amt=s.nextInt();
               if(amt<=bal)
               {               
                  bal-=amt;
               }
               else
               {
                   System.out.println("Enter the amount correctly..");  
                   withdr();
               }
               System.out.println("Do u want to perform the transaction again (y/n) : ");
               x=s.next().charAt(0);
}
void deposit()
{
               d++;
               Scanner s=new Scanner(System.in);
               System.out.println("enter the amount to be deposited :");
               amt=s.nextInt();
               bal+=amt;
               System.out.println("Do u want to perform the transaction again (y/n) : ");
               x=s.next().charAt(0);
}

void process()
{
Scanner s=new Scanner(System.in);
do
{
t=t+1;
System.out.println("Do you want to Withdraw or Deposit (w/d) : ");
pros=s.next().charAt(0);
if((pros=='w') || (pros=='W'))
{   
   w++;          
   withdr();
}
else if((pros=='d')||(pros=='D'))
{
  deposit();            
}
else
{
f++;
System.out.println("Plss..enter properly..(w/d) ");
System.out.println("Do u want to perform the transaction again (y/n) : ");
x=s.next().charAt(0);
}
}while((x=='y') || (x=='Y'));

System.out.println("Your Current Account Balance is :  "+bal);
System.out.println("Total no of Transactions done by you : "+t);
System.out.println("No of Withdraws is "+w+" & Deposits is "+d);
System.out.println("No of Transactions Failed : "+f);
}
}

class transactions
{
public static void main(String args[])
{
account act=new account();
act.inputs();
act.process();
}
}