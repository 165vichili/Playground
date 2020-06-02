import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      double a = 0.5;
      for(int i=1;i<=num;i++)
      {        	
      		System.out.print(a+" ");
      	a = a*3;
      }
	}
}