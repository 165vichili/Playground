import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Main object = new Main();
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      System.out.print("The term "+num+" in the fibonacci series is "+object.fibonacci(num));
    }
  int fibonacci(int num)
  {
  		if(num==1)
          return 0;
    else if(num ==2)
      return 1;
    else
      return fibonacci(num-1)+fibonacci(num-2);
  }
}