import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Main obj = new Main();
       Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int temp=0;
      System.out.print("The number of digits in "+num+" is "+obj.count(num));
    }
  int temp =0;
  int count(int num)
  { 
    if(num>0)
    {
    	temp++;
  	 count(num/10);
    }
      return temp;
  }
}