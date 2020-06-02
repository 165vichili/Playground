import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int [] arr = new int[num];
    for(int i=0;i<num;i++)
      arr[i] = in.nextInt();
    for(int i=0;i<num;i++)
      for(int j=i+1;j<num;j++)
        if(arr[i] > arr[j])
        {
        	int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
    System.out.printf("The median of the array is %.2f",(float)arr[num/2]);
  }
  }