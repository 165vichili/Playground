import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      int l1 = in.nextInt();
      int l2 = in.nextInt();
      int l3 = in.nextInt();
      if(l1 < l2)
        if(l1 < l3)
          System.out.print("L1");
      	else
          System.out.print("L3");
      else if(l2 < l3)
        System.out.print("L2");
      else
        System.out.print("L3");
    }
}