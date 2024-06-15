import java.util.*;
class countCharacter
{
public static void main(String args[])
{
String str="malayalam";
int count[]=new int[256];
for(int j=0;j<str.length();j++)
{
	count[str.charAt(j)]++;
}
for(int k=0;k<count.length;k++)
 {
	if(count[k]>0)
	{
	System.out.println((char)k+":"+count[k]);
	}
 }
}
}
