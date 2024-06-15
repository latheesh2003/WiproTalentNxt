import java.util.*;
/*class GarbageCollector
{
public static void main(String args[])
{
Runtime rs=Runtime.getRuntime();
System.out.println("Free Memory Before Garbage Collection "+rs.freeMemory());
rs.gc();
System.out.println("Free Memory After Garbage Collection "+rs.freeMemory());
*/
 public class GarbageCollector
{
	public static int count;
	counterTest()
	{
		count++;
	}

}

public static void main(String args[])
{
	GarbageCollector obj1=new GarbageCollector();
	System.out.println("the object Count : "+counterTest.count);
	GarbageCollector obj2=new GarbageCollector();
	System.out.println("the object Count : "+counterTest.count);
	Runtime rt=Runtime.getRuntime();
}
	obj1=Null;
	obj2=Null;
	r.gc();
}
protected void finalize()
{
	System.out.println("Program about to terminate: ");
	counterTest=count--;
	System.out.println("Number of Object: "+countTest.count);
}
}

