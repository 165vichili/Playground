import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      StringBuffer buffer = new StringBuffer();
		Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      str = str.toLowerCase();
	char[] arr =str.toCharArray();
      String reversed = "";
      for(int i=0;i<str.length();i++)
        reversed += arr[i];
      if(str.equals(reversed) && str.equals("amma"))
        System.out.print("Palindrome");
      else
        System.out.print("Not a Palindrome");
	}
}