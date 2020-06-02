import java.util.*;
class Main
{
  public static void main(String args[])
  {
		Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int [] arr = new int[num];
    int evenSum=0,oddSum=0;
    for(int i=0;i<num;i++)
    {
    	arr[i] = in.nextInt();
      if(arr[i]%2==0)
        evenSum = evenSum+arr[i];
      else
        oddSum = oddSum +arr[i];
    }
    System.out.println("The sum of the even numbers in the array is "+evenSum);
    System.out.println("The sum of the odd numbers in the array is "+oddSum);
  }
}