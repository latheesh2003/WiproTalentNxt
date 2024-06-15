import java.util.*;
class A
{
int a;
int b;
A(int n,int m)
{
a=n;
b=m;
}
void display()
{
System.out.println("the a value is: "+a+" the value of b is: "+b);
}
}
class B extends A
{
int c;
int a;
int b;
B(int n,int m,int l)
{
super(n,m);
a=n;
b=m;
c=l;
}
void display()
{
super.display();
System.out.println("the addition : "+a+"+"+b+"+"+c+" = "+(a+b+c));
}
}
class Inheritance1
{
public static void main(String args[])
{
B myB_Class=new B(4,5,6);
myB_Class.display();
}
}

