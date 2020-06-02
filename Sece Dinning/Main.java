import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      int rail = in.nextInt();
      if((str.equals("front") && rail == 1) || (str.equals("rear") && rail == 0))
        System.out.print("Left Handed");
      else
        System.out.print("Right Handed");
	}
}