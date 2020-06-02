import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      if(num > 99 && num < 1000)
      {
        	num = num / 10;
      		int middleNum = num % 10;
        if(middleNum%3 == 0)
          System.out.print("Trendy Number");
        else
          System.out.print("Not a Trendy Number");
      }
      else
        System.out.print("Not a Trendy Number");
    }
}