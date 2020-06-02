import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Main obj = new Main();
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int []  arr = new int[num];
      for(int i=0;i<num;i++)
        arr[i] = in.nextInt();
      System.out.print("The sum of the elements in the array is "+obj.sum(arr,num));
    }
  int sum(int [] arr, int num)
  {
  		if(num <=0)
          return 0;
    return sum(arr,num-1)+arr[num-1];
  }
}