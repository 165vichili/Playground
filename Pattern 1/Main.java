import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      for(int i=num;i>0;i--)
      {
      	for(int j=1;j<(2*i);j++)
          System.out.print(j+" ");
      	 System.out.println();
      }
	}
}