import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      double n=95.0;
      double s =20.5;
      for(int i=0;i<num;i++)
      {
      	System.out.print(n+" ");
        n = n+s;
        s = s+2;
      }
	}
}