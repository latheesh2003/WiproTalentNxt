import java.util.*;
abstract class bird
{
  abstract void eat();
  abstract void fly();
}

 abstract class eagle extends bird{
 abstract void eat();
  void fly()
  {
   System.out.println("Eagle eats");
  }
}
class sparrow extends bird
{
  void eat()
  {
    System.out.println("sparrow eats");
  }
 void fly()
 {
   System.out.println("Sparrow flies");
 }
}
 class golden_eagle extends eagle
{
  void eat()
  {
   System.out.println("Golden eagle eats");
  }
}
class serpent_eagle extends eagle
{
  void eat()
  {
   System.out.println("Serpent eagle eats");
  }
}
class launchbird
{
  public static void main(String args[])
  { 
   golden_eagle ge= new golden_eagle();
   serpent_eagle se=new serpent_eagle();
   sparrow s=new sparrow();
    ge.eat();
	se.eat();
	s.fly();

}
}