import java.util.*;
import java.io.*;

class Employee implements Serializable{
int empId;
String name;
int age;
double salary;
 Employee(int empId,String name,int age,double salary)
  {
	this.empId=empId;
	this.name=name;
	this.age=age;
	this.salary=salary;
  }
public String toString()
{
	return name+" "+age+" "+salary;
}
}
class IO_Stream_MiniProject
{
public static void main(String args[])throws Exception
{
Scanner sc=new Scanner(System.in);
Employee emp=null;
ArrayList<Employee> empList=new ArrayList<>();
try{
FileInputStream fis=new FileInputStream("employee_data.txt");
ObjectInputStream ois=new ObjectInputStream(fis);
int count=ois.readInt();
for(int i=0;i<count;i++)
{
	emp=(Employee)ois.readObject();
	System.out.println(emp);
	empList.add(emp);
}
fis.close();
ois.close();
for(Employee e:empList)
{
	System.out.println(e);
}
}
catch(Exception e){}

FileOutputStream fos=null;
ObjectOutputStream oos=null;

int choice;
do{
System.out.println(" MENU ");
System.out.println(" 1.Add the Employee ");
System.out.println(" 2.Display All ");
System.out.println(" Exit ");
System.out.println();
System.out.println("Enter The Choice: ");
choice=sc.nextInt();
int empId;
String name;
int age;
double salary;

switch(choice)
{
case 1:
System.out.print("Enter the employeeID: ");
empId=sc.nextInt();
sc.nextLine();
System.out.print("Enter the employee Name: ");
name=sc.next();
System.out.print("Enter the employee Age: ");
age=sc.nextInt();
System.out.println("Enter the employee Salary: ");
salary=sc.nextDouble();
emp=new Employee(empId,name,age,salary);
empList.add(emp);
try{
 fos=new FileOutputStream("employee_data.txt");
oos=new ObjectOutputStream(fos);
oos.writeObject(empList);
}
catch(Exception e){}
break;

case 2:
for(Employee a:empList)
	System.out.println(a);
		     break;



case 3:
System.out.println("Exiting the System");
}
}
while(choice!=3);
fos.close();
oos.close();

}
}
	





