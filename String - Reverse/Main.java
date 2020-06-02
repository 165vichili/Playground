import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
      StringBuffer buffer =new StringBuffer();
      String str = in.nextLine();
      buffer.append(str);
      System.out.print(buffer.reverse());
	}
}