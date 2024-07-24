import java.util.*;
import java.io.*;
class Account implements Serializable
{
String accno;
String name;
double balance;

Account(){}
public Account(String a,String name,double balance)
{
accno=a;
this.name=name;
this.balance=balance;
}
public String toString()
{
return "Accountno= "+accno+"\n"+"Name= "+name+"\n"+"balance= "+balance;
}
}

public class MenuDrivenforAccount
{
public static void main(String args[])throws Exception
{
Account act=null;
HashMap<String,Account> hm=new HashMap<>();
try{
FileInputStream fis=new FileInputStream("account.txt");
ObjectInputStream ois=new ObjectInputStream(fis);

int count=ois.readInt();
for(int i=0;i<count;i++)
{
	act=(Account)ois.readObject();
	System.out.println(act);
	hm.put(act.accno,act);
}
fis.close();
ois.close();
}
catch(Exception e)
{}


FileOutputStream fos=new FileOutputStream("account.txt");
ObjectOutputStream oos=new ObjectOutputStream(fos);
int choice;
String accno="";
String name;
double balance;
do
{
	System.out.println("MENU   ");
		System.out.println();
	System.out.println(" 1.Create Account ");
	System.out.println(" 2.Delete Account ");
	System.out.println(" 3.View Account ");
	System.out.println(" 4.View All Accounts ");
	System.out.println(" 5.Save Accounts ");
	System.out.println(" 6.Exit ");
	System.out.println();
	System.out.print("Enter your Choice: ");
	Scanner sc=new Scanner(System.in);
    choice=sc.nextInt();
	sc.nextLine();
	 switch(choice)
	 {
		 case 1:
		 
			 System.out.println("enter the accno,Name,Balance: ");
			 accno=sc.nextLine();
			 name=sc.nextLine();
			 balance=sc.nextDouble();
			 act=new Account(accno,name,balance);
			 hm.put(accno,act);
			 System.out.println("Account Created for "+name);
			 break;
		 
		 case 2:
		 
			 System.out.println("Enter the Accno: ");
			 accno=sc.nextLine();
			 hm.remove(accno);
			 break;
		 
		 case 3:
		 
			 System.out.println("Enter the Accno: ");
			String acno=sc.nextLine();
			 hm.get(accno);
			 if(acno.equals(accno)){
			 System.out.println(act);}
			 else
				 System.out.println("no such Account number ");
			 break;
		 
		 case 4:
			 for(Account a:hm.values())
			 System.out.println(a);
		     break;
		 case 5:
		 case 6:
		 oos.writeInt(hm.size());
		 for(Account a:hm.values())
			 oos.writeObject(a);
		      break;
	 }
}
		 while(choice!=6);
			 oos.close();
		     fos.close();

}
}
			 
			 
			 
			 
			 
	
	
	

