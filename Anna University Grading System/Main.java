import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int num;
		Scanner obj=new Scanner(System.in);
		num=obj.nextInt();
		if(num==100)
		{
		    System.out.print("S");
		}
		else if(num>=90 && num<=99)
		{
		    System.out.print("A");
		}
		else if(num>=80 && num<=89)
		{
		    System.out.print("B");
		}
		else if(num>=70 && num<=79)
		{
		    System.out.print("C");
		}
		else if(num>=60 && num<=69)
		{
		    System.out.print("D");
		}
		else if(num>=50 && num<=59)
		{
		    System.out.print("E");
		}
		else if(num<50)
		{
		    System.out.print("F");
		}
		else if(num>100)
		{
		    System.out.print("Invalid Input");
		}
    }
}