import java.util.*;
class Guesser
{
    int gnum;
    int guessNum()
    {
        System.out.println("guesser! guess the number from 1 to 20 : ");
        Scanner sc=new Scanner(System.in);
        gnum=sc.nextInt();
        return gnum;
    }
}
class Player
{
    int pnum;
    int playerNum()
    {
        System.out.println("player! guess the number : ");
        Scanner sc=new Scanner(System.in);
        pnum=sc.nextInt();
        return pnum;
    }
}
class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    void CollectFromGuesser()
    {
        Guesser g=new Guesser();
        numFromGuesser=g.guessNum();
    }
    void CollectFromPlayer()
    {
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        numFromPlayer1=p1.playerNum();
        numFromPlayer2=p2.playerNum();
        numFromPlayer3=p3.playerNum();
    }
    void compare()
    {
        if(numFromGuesser==numFromPlayer1&&numFromGuesser==numFromPlayer2&&numFromGuesser==numFromPlayer3)
        {
            System.out.println("Player1,2,3 winners");
        }
        else if(numFromGuesser==numFromPlayer1&&numFromGuesser==numFromPlayer2 )
        {
            System.out.println("Player1,2 win");
        }
        else if(numFromGuesser==numFromPlayer2&&numFromGuesser==numFromPlayer3)
        {
            System.out.println("Player2,3 win");
        }
        else if(numFromGuesser==numFromPlayer1&&numFromGuesser==numFromPlayer3)
        {
            System.out.println("Player1,3 win");
        }
        else if(numFromGuesser==numFromPlayer1)
        {
            System.out.println("Player1 win");
        }
        else if(numFromGuesser==numFromPlayer2)
        {
            System.out.println("Player2 win");
        }
        else if(numFromGuesser==numFromPlayer3)
        {
            System.out.println("Player3 win");
        }
        else 
        {
            System.out.println("you lost!!");
        }
    }
}
class LaunchGuesserGame
{
    public static void main(String arg[])
    {
        Umpire u=new Umpire();
        u.CollectFromGuesser();
        u.CollectFromPlayer();
        u.compare();
    }
}
