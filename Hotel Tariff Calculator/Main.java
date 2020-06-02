import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
      int month = in.nextInt();
      double rent = in.nextDouble();
      int days = in.nextInt();
      switch(month)
      {
        case 4:
        case 5:
        case 6:
        case 11:
        case 12: System.out.print(0.2*rent*days + rent*days); break;
        case 1:
        case 2:
        case 3:
        case 7:
        case 8:
        case 9:
        case 10: System.out.print(rent*days); break;
        default: System.out.print("Invalid Input");
      }
	}
}