import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      int num= in.nextInt();
      int[] arr = new int[num];
      int max = 0;
      for(int i=0;i<num;i++)
      {
        arr[i] = in.nextInt();
      	if(max<arr[i])
          max =arr[i];
      }
      System.out.print(max +" is the maximum element in the array");
    }
}