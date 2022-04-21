import java.util.*;
class account
{
private String acname;
private long acnum;
char x;
int amt,pros,bal=10000,t=0,w=0,d=0,f=0;

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
System.out.println("Enter 1-Withdraw, 2-Deposit, 3-Balance, 4-Exit : ");
pros=s.nextInt();
switch(pros)
{
case 1: w++; withdr();break;
case 2:deposit();break;
case 3:System.out.println("Your Current Account Balance is :  "+bal); break;
case 4: x='n';break;
default: {f++;
System.out.println("Plss..enter properly.");
System.out.println("Do u want to perform the transaction again (y/n) : ");
x=s.next().charAt(0);
}
}
}while((x=='y') || (x=='Y'));

System.out.println("Your Current Account Balance is :  "+bal);
System.out.println("Total no of Transactions done by you : "+t);
System.out.println("No of Withdraws is "+w+" & Deposits is "+d);
System.out.println("No of Transactions Failed : "+f);
}
}

class trans
{
public static void main(String args[])
{
account act=new account();
act.inputs();
act.process();
}
}