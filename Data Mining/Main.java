import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int remainder = 0, evenSum =0, oddSum = 0;
      while(num != 0){
      	remainder = num %10;
        if(remainder %2 == 0)
          evenSum = evenSum + remainder;
        else
          oddSum = oddSum + remainder;
        num = num/10;
      }
      if(evenSum == oddSum)
        System.out.print("yes");
      else
        System.out.print("No");
    }
}