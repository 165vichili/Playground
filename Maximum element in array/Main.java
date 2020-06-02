import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Main object = new Main();
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int [] arr = new int[num];
      for(int i=0;i<num;i++)
        arr[i]=in.nextInt();
    	System.out.print("Maximum element in the array is "+object.maximumElement(arr,0,num));
    }
  int maximumElement(int [] arr,int index, int length)
  {
  	int max;
    if(index >= length-2)
    	if(arr[index] > arr[index+1])
          return arr[index];
    	else
          return arr[index+1];
    max = maximumElement(arr,index+1,length);
    if(arr[index]>max)
      return arr[index];
    else
      return max;
  }
}