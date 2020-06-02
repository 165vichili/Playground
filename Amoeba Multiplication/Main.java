import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
     	Scanner in = new Scanner(System.in);
      int month = in.nextInt();
      int a = 0 , b = 1,c=0;
      for(int i = 2 ; i < month ; i++)
      {
       		c = a + b;
        	a = b;
        	b = c;
      }
      System.out.print(c);
    }
}