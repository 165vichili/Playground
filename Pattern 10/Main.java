import java.util.Scanner;
class A
{
    void fun(int a)
    {
       for(int i=1;i<=a;i++)
	  {
		    for(int j=1;j<=a;j++)
		    {
		        if(i%2!=0 && j==a || i%2==0 && j==1)
		        {
		        System.out.print((i+1));
		        }
		        
		        else
		        {
		           System.out.print(i); 
		        }
		    }
		    System.out.printf("\n");
		} 
    }
}
class Main
{
	public static void main(String args[])
	{
	    	Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		A obj=new A();
		obj.fun(a);
	}
}