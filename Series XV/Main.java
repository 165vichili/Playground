import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int a = 3,b=8,sum;
      System.out.print(a+" "+b+" ");
      for(int i=2;i<num;i++)
      {
      		sum = a+b+i;
        System.out.print(sum + " ");
        a =b;
        b = sum;
      }
	}
}