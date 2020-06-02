import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
      int num= in.nextInt();
      int a = 9,b=11,c;
      System.out.print(a+" "+b+" ");
      for(int i=2;i<num;i++)
      {
      	c = b+a;
        System.out.print(c+" ");
      	a = b;
        b = c;
      }
	}
}