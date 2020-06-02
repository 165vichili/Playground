import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
       //fill the code;
       Scanner s=new Scanner(System.in);
       int x=s.nextInt();
       int y=s.nextInt();
       int z=s.nextInt();
       int n=s.nextInt();
       if(n<=x&&n<=y&&n<=z)
       {
           System.out.println("3");
       }
       else if((n<=x&&n<=y) ||(n<=x&&n<=z) ||(n<=y&&n<=z))
       {
           System.out.println("2");
       }
       else if(n<=x||n<=y||n<=z)
       {
           System.out.println("1");
       }
       else
       {
           System.out.println("0");
       }
   }
}