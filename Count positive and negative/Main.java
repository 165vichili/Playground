import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int positiveCount=0,negativeCount=0;
      for(int i=0;i<a;i++)
      {
      	int num = in.nextInt();
        if(num > 0)
          positiveCount++;
        else
          negativeCount++;
      }
      System.out.print("Number of positive numbers is "+positiveCount+" and the number of negative numbers is "+negativeCount);
    }
}