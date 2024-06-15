import java.util.*;
class launch
{
private int i=0;
private int j;
static public void set(int a,int b)
{
i=a;
j=b;
}
public void show()
{
System.out.println(i);
System.out.println(j);
}
}
class staticcheck
{
public static void main(String args[])
{
launch l=new launch();
l.set(10,20);
l.show();
}
}