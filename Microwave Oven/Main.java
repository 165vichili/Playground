import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
      int items = in.nextInt();
      double heat =  in.nextDouble();
      if(items == 2)
        System.out.print(heat*1.5);
      else if(items == 3)
        System.out.print(heat*2);
      else if(items > 3)
        System.out.print("Number of items is more");
	}
}