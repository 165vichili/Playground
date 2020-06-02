import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
      int br = in.nextInt();
      int vs = in.nextInt();
      int as = in.nextInt();
      int arms = in.nextInt();
      int legs = in.nextInt();
      if((br*350.34 + vs*230.90 + as*190.55 + arms*125.30 + legs*180.90) <= 15000)
        System.out.print("Yes");
      else
        System.out.print("No");
	}
}