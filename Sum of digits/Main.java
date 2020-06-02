import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Main obj = new Main();
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      System.out.print("The sum of digits in "+num+" is "+obj.sum(num));
    }
                       int sum(int num)
                       {
                       		if(num <= 9)
                              return num;
                         else
                           return num%10+sum(num/10);
                       }
}