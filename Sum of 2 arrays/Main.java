import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int [] arr1 = new int[num];
      int [] arr2 = new int[num];
      int[] arr3 = new int[num];
      for(int i=0;i<num;i++)
        arr1[i] = in.nextInt();
      for(int i=0;i<num;i++)
      {
        arr2[i] = in.nextInt();
      	arr3[i] = arr1[i]+arr2[i];
      }
      for(int i=0;i<num;i++)
        System.out.println(arr3[i]);
      {
      		
      }
    }
}