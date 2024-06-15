import java.util.*;
class ReplaceVowels
{
public static void main(String args[])
{
String str="bcdfgh";
String str1=new String("");
//StringBuild Newstring=new StringBuild(str);
for(int j=0;j<str.length();j++)
{
char c=str.charAt(j);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
{
str1+='z';
}
else
	str1+=c;
}
System.out.println(str1);

if(str.equals(str1))
{
	System.out.println(" no vowels are changed");
}

}
}

