import java.util.*;
class sample
{

public static void main(String args[])
{
	/*
Scanner sc=new Scanner(System.in);
for(int row=1;row<10;row++)
{
	int count=0;
	//int c=65+row-2;
	for(int space=1;space<10;space++)
	{
		if(row+space>10)
		{
			System.out.print(++count+" ");
		}
		else System.out.print("  ");
	}
	if(row>1)
	{
		for(int column=1;column<=row-1;column++)
		{
			System.out.print(count+" ");
		}
	}
	System.out.println();
}
*/
/*
int a[]={1,-2,4,-0,2,-0,6,7,-2};
int Count_Negative=0;
int Count_Nonnegative=0;
for(int i=0;i<=a.length-1;i++)
{
	if(a[i]>=-0)
	{
		Count_Nonnegative++;
	}
	else
		Count_Negative++;
}
System.out.println("non-negative count: "+Count_Nonnegative);
System.out.println("negative count: "+Count_Negative);
*/
// take the input from the user
//we have to see if it is dividing the number or not by using module operator
//and print the number which is printing and use break statement

/*
int arr[]=new int[]{10,20,30,40,50,60,70,80};
int sum=0;
float average=0;
int count=0;
for(int i=0;i<arr.length;i++)
{
	sum+=arr[i];
}
average=sum/arr.length;
System.out.println("the average is :"+average);
for(int i=0;i<arr.length;i++)
{
	if(arr[i]<average)
	{
		count++;
	}
}
System.out.println("the number of elements less than average is : "+count);
*/
/*  maximum 3 numbers and minimum 3  numbers
int arr[]=new int[]{2,45,23,67,78,3,8,9,10};
int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++)
{
	if(arr[i]>max1)
	{
		max3=max2;
		max2=max1;
		max1=arr[i];
	}
	else if(arr[i]>max2)
	{
		max3=max2;
		max2=arr[i];
	}
	else if(arr[i]>max3)
	{
		max3=arr[i];
	}
	
}
System.out.println("maximum1 : "+max1+" maximum2 : "+max2+" maximum3 : "+max3);

int min1=max1,min2=0,min3=0;

for(int i=0;i<arr.length;i++)
{
	if(arr[i]<min1)
	{
		min3=min2;
		min2=min1;
		min1=arr[i];
	}
	else if(arr[i]<min2)
	{
		min3=min2;
		min2=arr[i];
	}
	else if(arr[i]<min3)
	{
		min3=arr[i];
	}
	
}
System.out.println("minimum1 : "+min1+" manimum2 : "+min2+" minimum3 : "+min3);
*/
String str="LATHEESH";
String New_String=str.toLowerCase();
for(int i=0;i<New_String.length();i++)
{
if(New_String.charAt(i)=='a'||New_String.charAt(i)=='e'||New_String.charAt(i)=='i'||New_String.charAt(i)=='o'||New_String.charAt(i)=='u')
{
New_String.replace(New_String.charAt(i),'z');
}
else continue;
}
System.out.println(New_String);
}
}


