import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
      int num= in.nextInt();
      int n =2;
      for(int i=1;i<=num;i++)
      {
        System.out.print(n+" ");
      	n=(n*n)-1;
      }
	}
}