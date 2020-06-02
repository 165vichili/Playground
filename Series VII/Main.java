import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      double even=2.0,odd=3.0;
      for(int i=1;i<=num;i++)
        if(i==1)
          System.out.print(1+" ");
      else if(i%2==0)
      {
      	System.out.print(even+" ");
        even = even * 3;
      }
      else
      {
      	System.out.print(odd+" ");
        odd = odd*3;
      }
	}
}