import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int s = 1,f=1;
      for(int i=num;i>0;i--)
      {
        for(int j=0;j<i;j++)
        {
        	System.out.print(s+" ");
          s = s+2;
        }
        f = f+2;
        s = f;
      	System.out.println();
      }
	}
}