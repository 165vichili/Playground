import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      	int num = in.nextInt();
      int count = 0;
      System.out.println(num);
      while(num != 1)
      {
      		if(num%2 == 0)
              num = num/2;
        	else
              num = (3*num)+1;
        System.out.println(num);
        count = count+1;
      }
      System.out.println(count);
    }
}