import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int sum =2;
      for(int i=0;i<num;i++)
      {
      	System.out.print(sum+" ");
        sum = (sum *2) +1;
      }
	}
}