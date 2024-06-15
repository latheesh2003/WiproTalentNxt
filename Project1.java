import java.util.*;
import java.lang.*;
class Employees
{
	public int emp_id;
	public int Emp_no[]={1001,1002,1003,1004,1005,1006,1007};
	public String Emp_name[]={"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
	public String Join_Date[]={"01/04/2008","23/08/2012","12/11/2008","29/01/2013","16/07/2005","1/1/2000","12/06/2006"};
    public char Designation_Code[]={'e','c','k','r','m','e','c'};
	public String Department[]={"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
	public int Basic[]={20000,30000,10000,12000,50000,23000,29000};
	public int HRA[]={8000,12000,8000,6000,20000,9000,12000};
	public int IT[]={3000,9000,1000,2000,20000,4400,10000};
	public int index=-1;
	public Employees(int emp_id)
	{
    this.emp_id=emp_id; 
	for(int i=0;i<Emp_no.length;i++)
	{
		if(emp_id==Emp_no[i])
		{
			index=i;
		     break;
		}
	}
	}
	public String getEmp_name()
	{
			return Emp_name[index];
	}
	public char getDesignation_Code(){
		 return  Designation_Code[index];
	}
	public String getDepartment(){
			return Department[index];
	}
	public String Designation;	
	public String getDesignation_name()
	{
	switch(getDesignation_Code())
	{
		case 'e':
		{
		Designation="Engineer";
		break;
		}
	    case 'c':
		{
		Designation="Consultant";
		break;
		}
	   case 'k':
		{
		Designation="Clerk";
		break;
		}
		case 'r':
		{
		Designation="Recetionist";
		break;
		}
		case 'm':
		{
		Designation="Manager";
		break;
		}
	}
	return Designation;
}
	public int DA;
	public int getDesignation_salary()
	{
	switch(getDesignation_Code())
	{
		case 'e':
		{
		DA=20000;
		break;
		}
	    case 'c':
		{
		DA=32000;
		break;
		}
	   case 'k':
		{
		DA=12000;
		break;
		}
		case 'r':
		{
	   DA=15000;
		break;
		}
		case 'm':
		{
		DA=40000;
		break;
		}
	}
	return DA;
}

	public int Salary()
	{
	 return (Basic[index]+HRA[index]+getDesignation_salary()-IT[index]);
	}
	public String Details()
	{
		if(index==-1)
		{
			return "There is no employee with emp_id: "+emp_id;
		}  
	 return "Emp_No: "+emp_id+"   Emp_Name:"+getEmp_name()+"   Department:"+getDepartment()+"  Designation:"+getDesignation_name()+"   Salary:"+Salary();
	}
    
}

public class Project1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int emp_id=Integer.parseInt(args[0]);
Employees e=new Employees(emp_id);
System.out.println(e.Details());
}
}