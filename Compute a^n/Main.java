import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Main obj = new Main();
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int pow = in.nextInt();
      System.out.print("The value of "+num+" power "+pow+" is "+obj.power(num,pow));
    }
  int power(int num, int pow)
  {
    	if(pow == 0)
          return 1;
  		else
          return num*power(num,pow-1);
  }
}