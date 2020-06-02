import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int sum=4;
      for(int i=0;i<num;i++)
      {
        sum = sum + (int)Math.pow(i,2);
        System.out.print(sum+" ");
      }
	}
}