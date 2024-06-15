import java.util.*;
class super1{
int money;
private int pocketmoney;
super1(int money,int pocketmoney)
{
this.money=money;
this.pocketmoney=pocketmoney;
}
public void fill(){
System.out.println(money+pocketmoney);}
}
class sub extends super1{
int total=10;
public void sum()
{
//total=money+pocketmoney;
System.out.println(total);
}
}

class inheritance
{
public static void main(String args[])
{
	super1 s1=new super1(100,200);
sub s=new sub();
s.sum();
s1.fill()
}
}