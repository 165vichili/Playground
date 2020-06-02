import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
	     	int a1=s.nextInt();
	     	int i=0,j;
	     	int c=0;
    for(i=1;i<=a1;i++)
    {
       for(j=1;j<=i;j++)
        {  
            ++c;
            if(c%2==0)
            System.out.print("1 ");
            else
                System.out.print("0 ");   
        }
        System.out.println();   
    }
	}
}