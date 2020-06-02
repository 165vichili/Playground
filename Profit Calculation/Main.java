import java.util.*;
class Main
{
	public static void main (String args [])
	{
		Scanner in=new Scanner (System.in);
		int sp,cp,p,l=0;
		sp=in.nextInt();
        cp=in.nextInt();
        p=in.nextInt();
        l=((sp*cp)-(sp*p))-100;
  		System.out.println("The profit obtained is Rs."+l);

	}
}