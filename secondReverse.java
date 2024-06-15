import java.util.*;
class secondReverse
{
public static void main(String args[])
{
String str="hello";
String str1="world";
String str3=new String("");
for(int i=str1.length()-1;i>=0;i--)
{
str3+=str1.charAt(i);
}
System.out.println(str+str3);
}
}
