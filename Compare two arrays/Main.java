import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int[] arr1 = new int[num];
    int[] arr2 = new int[num];
    boolean flag = false;
    for(int i=0;i<num;i++)
      arr1[i] = in.nextInt();
    for(int i=0;i<num;i++)
    {
      arr2[i] = in.nextInt();
    if(arr1[i] != arr2[i] )
      flag = true;
    }
    if(flag)
      System.out.print("No");
    else
      System.out.print("Yes");
    }
}