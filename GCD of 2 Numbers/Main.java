import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Main obj = new Main();
        Scanner in = new Scanner(System.in);
    	int num1 = in.nextInt();
      int num2 = in.nextInt();
      System.out.print("G.C.D of "+num1+" and "+num2+" is "+obj.gcd(num1,num2));
    }
  int gcd(int n1,int n2)
  {
  	if(n2!=0)
      return gcd(n2,n1%n2);
    else
      return n1;
  }
}