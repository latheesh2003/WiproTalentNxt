import java.util.*;
/*
class sample
{
	int i;
	sample(int i)
	{
		this.i=i;
		System.out.println(i);
	}
}
class quiz_OOPS
{
	public static void main(String[] args){
	sample s=new sample();
	
	/*
int i_value=10;
public static void main(String[] args)
{
System.out.println(i_value);
}*/
/*
class sample{
	 sample()
	{
		System.out.println("constructor static");
	}
	static 
	{
	System.out.println("static block 1");
	}
	static void block1()
	{
		System.out.println("static method1");
	}
	static 
	{
	System.out.println("static block 2");
	}
	static void block2()
	{
		System.out.println("static method2");
	}
}
class quiz_OOPS
{
	public static void main(String[] args){
	System.out.println("with in main");
	sample s=new sample();
	sample.block1();
	}
}*/
class sample{
	public static void main(String args[])
	{
		System.out.println("with in the main class");
		static{
			System.out.println("it is in static block");
			
		}
	}
}
