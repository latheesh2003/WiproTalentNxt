
package videolauncher;
import java.util.Scanner;
class Video
{
    public String videoname;
    public boolean checkout=false;
    public int rating;
    int count=1;
   public String videoID;
   public void setID(String videoID)
   {
       this.videoID=videoID;
   }
   public String getvideoID()
   {
       return videoID;
   }
    public Video(String name)
    {
        this.videoname=name;
    }
    public String getName()
    {
        return videoname;
    }
    public void doCheckOut()
    {
       this.checkout=true;
    }
    public void doReturn()
    {
    this.checkout=false;
    }
    public void receiveRating(int rating)
    {
    this.rating=rating;
    }
    public int getRating()
    {
        return rating;
    }
    public boolean getCheckout(){
         return checkout;
    }  
}
class VideoStore
{
   // Scanner sc=new Scanner(System.in);
    Video[] store;
    int count=0;
    public VideoStore(int size)
    {
        store=new Video[size];
    }
    public void addVideo(String name){
     if (count < store.length) 
     {
            store[count] = new Video(name);
            
            store[count].setID("user"+count);
            
            System.out.println("your userID is: "+store[count].getvideoID());
            System.out.println("Video " + name+ " added successfully");
            count++;
     }
    }
    public void doCheckout(String name)
    {
        for(int i=0;i<count;i++)
        {
        if(name.equals(store[i].getName()))
        {
            store[i].doCheckOut();
            System.out.println("video "+name+" checkedout Sucessfully"+" with userID of "+store[i].getvideoID());
        }
        }
        System.out.println("no vedio game in the list ");
    }
    public void doReturn(String name)
    {
         for(int i=0;i<count;i++)
        {
        if(name.equals(store[i].getName()))
        {
              store[i].checkout=false;
              System.out.println("video "+name+" returnout Sucessfully"+" with userID of "+store[i].getvideoID());
             }
           }
           System.out.println("no vedio game in the list to returnout please add the the vedio ");
    }
   public void recieveRating(String name,int rating)
    {
          for(int i=0;i<count;i++){
              if(name.equals(store[i].getName())){
          store[i].receiveRating(rating);
          System.out.println("Rating "+store[i].getRating()+" has been mapped to the "+name);
          }
          }
    }
    public void listInventory()
    {
        for(int i=0;i<count;i++ )
        System.out.println("  userID: "+store[i].getvideoID()+"\n"+"Video Name: "+store[i].getName()+"\n"+"Checkout Status: "+store[i].getCheckout()+"\n"+"Rating: "+store[i].getRating());
    }
    
}


public class VideoLauncher {

    public static void main(String[] args) {
        VideoStore vs=new VideoStore(5);
        Scanner sc=new Scanner(System.in);
        boolean exit=false;
        while(!exit){
       System.out.println("MAIN MENU");
     System.out.println("1.Add Videos ");
     System.out.println("2.Check Out Video ");
     System.out.println("3.Return Video ");
     System.out.println("4.Receive Rating ");
     System.out.println("5.List Inventory ");
     System.out.println("6.Exit ");
     System.out.print("enter your Choice (1...6): ");
     int n=sc.nextInt();
     sc.nextLine();
     switch(n)
     {
         case 1: {
             System.out.print("enter the name of the video you want to add: ");
             String name=sc.nextLine();
             vs.addVideo(name);
             break;
             }
         case 2: {
             System.out.print("enter the name of the video you want to check out: ");
             String name=sc.nextLine();
             vs.doCheckout( name);
             break;
                }
         case 3:{
             System.out.print("enter the name of the video you want to Return: ");
              String name=sc.nextLine();
              vs.doReturn(name);
              break;
                }
         case 4:{
             System.out.print("enter the name of the video you want to Rate: ");
             String name=sc.nextLine();
             System.out.print("enter the rating: ");
             int rating=sc.nextInt();
             vs.recieveRating(name,rating);
             break;
                }
         case 5: {
                vs.listInventory();
                break;
                   }
         case 6:{
                System.out.println("Exiting...!!Thanks for using application" );
                System.out.println();
                exit=true;
                break;
                }
         default: {
                System.out.println("Please enter the number which is in the MAIN MENU: " );
                break;
                }
            }
    // sc.close();
             
         }
        sc.close();
     }
}
     
