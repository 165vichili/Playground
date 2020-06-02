import java.util.*;
class Main
{
  public static void main(String args[])
  {
    	Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int[] arr1 = new int[num];
    int [] arr2 = new int[num];
   	boolean incompatible = false;
    for(int i=0;i<num;i++)
      arr1[i] = in.nextInt();
    for(int i=0;i<num;i++)
      arr2[i] = in.nextInt();
    for(int i=0;i<num;i++){
    	if(arr1[i]<arr2[i])
          incompatible = true;
    }
    if(incompatible)
      System.out.print("Incompatible");
    else
      System.out.print("Compatible");
      
  }
}