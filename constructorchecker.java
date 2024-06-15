import java.io.*;
class CopyFile_IOStream
{
  public static void main(String[] args)
  {
	  try{
	  FileOutputStream fos=new  FileOutputStream("source1.txt");
	  String str1="JAVA PROGRAMMING";
	  String str2="ALL THE BEST";
	  byte b[]=str1.getByte();
	  byte c[]=str2.getByte();
	  for(byte d:b)
	  System.out.print(d);
      
	  for(byte e:b)
      System.out.print(e);
	  }
	  catch(Exception e){System.out.print(e);}

}
}


