import java.util.*;

class employee
{
long employee_id,employee_phone;
String employee_name,employee_address;
double basic_salary,special_allowance=250.80,hra=1000.50;

void employee(long id,String name,String address,long phone)
{
employee_id=id;
employee_name=name;
employee_address=address;
employee_phone=phone;
}
void calculatesalary()
{
double salary;
salary=basic_salary+(basic_salary*special_allowance/100)+(basic_salary*hra/100);
System.out.println("Salary is "+salary);
}
}

class manager extends employee
{
manager(long id,String name,String address,long phone,double salary)
{
employee_id=id;
employee_name=name;
employee_address=address;
employee_phone=phone;
basic_salary=salary;
}
}

class trainee extends employee
{
trainee(long id,String name,String address,long phone,double salary)
{
employee_id=id;
employee_name=name;
employee_address=address;
employee_phone=phone;
basic_salary=salary;
}

}

class inheritanceactivity
{
public static void main(String args[])
{
manager m = new manager(126534,"Peter","Chennai India",237844,65000.0);
m.calculatesalary();
}
}