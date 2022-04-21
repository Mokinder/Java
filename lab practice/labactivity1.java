import java.util.*;
class x
{
void firstlast()
{       int number ;
        int fd = 0;
        int ld = 0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        number=s.nextInt();
        ld= number%10;
        while(number!=0)
        {
            fd = number%10;
            number /= 10;
        }
        System.out.println("First digit: "+fd);
        System.out.println("Last digit: "+ld);
    }
}


class labactivity1
{
public static void main(String args[])
{
x x1=new x();
x1.firstlast();
}
}