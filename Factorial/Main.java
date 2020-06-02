import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Main object = new Main();
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      System.out.print("The factorial of "+num+" is "+object.factorial(num));
    }
  int factorial(int num)
  {
  		if(num < 2)
          return 1;
       else
      return num*factorial(num-1);
  }
}