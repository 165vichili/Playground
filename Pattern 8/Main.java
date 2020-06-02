import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      for(int i=1;i<=num;i++)
      {
      		for(int j=1;j<=num;j++)
            {
            	if(i == j || i+j == num+1)
                  System.out.print("*");
              else
                System.out.print(" ");
            }
        System.out.println();
      }
	}
}