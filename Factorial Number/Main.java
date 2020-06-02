import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int fact = 1;
      for(int i=1;i<=num;i++)
      {
      	fact = fact*i;
        if(fact == num)
        {
        	System.out.print("Yes");
          break;
        }
        else if(fact > num)
        {
        	System.out.print("No");
          break;
        }
      }
    }
}