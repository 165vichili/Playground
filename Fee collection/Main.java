import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        float tui=sc.nextInt();
        float bus=sc.nextInt();
        float hstl=sc.nextInt();
        if(str.equals("MSDS"))
        {
            System.out.printf("%.2f",(tui+bus));
        }
        else if(str.equals("MSH"))
        {
             System.out.printf("%.2f",(tui+hstl));
        }
         else if(str.equals("MGSDS"))
        {
             System.out.printf("%.2f",(1.5*tui+bus));
        }
         else if(str.equals("MGSH"))
        {
             System.out.printf("%.2f",(1.5*tui+hstl));
        }
      	else
      	{
      		System.out.printf("Invalid");
      	}
    }
}