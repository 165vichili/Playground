import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      for(int i=num;i>0;i--)
      {
        int k= i; 
        for(int j=num;j>0;j--)
        {
          if(j>i){
        	System.out.print(k);
          	k++;
          }
            else
            System.out.print(num);
        }
      	System.out.println();
      }
	}
}