import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
      String str1 = in.nextLine();
      String str2 = in.nextLine();
      if(str1.equals(str2))
        System.out.print("Strings are same");
      else
        System.out.print("Strings are not same");
	}
}