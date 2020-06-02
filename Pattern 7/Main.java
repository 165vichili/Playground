import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
      int num =  in.nextInt();
      for(int i=1;i<=num;i++)
      { 
        int c = 0;
      	for(int j=0;j<i;j++)
        {
          if(c%2==0)
        	System.out.print("1 ");
          else
            System.out.print("0 ");
          c++;
        }
        System.out.println();
      }
	}
}