import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int div=a/10;
		int rem=a%10;
		int sum=div+rem;
		System.out.println("Alice must go in path-"+sum);
	}
}