import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i;
		double p=11;
		for(i=0;i<n;i++)
        {
	    	System.out.printf("%d ",(int)Math.pow(p,2));
			p=p+4;  
		}
	}
	
}