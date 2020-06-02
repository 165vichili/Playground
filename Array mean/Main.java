import java.util.*;
 class Main
 {
   public static void main(String args[])
   {
     	Scanner in = new Scanner(System.in);
     int num = in.nextInt();
     int [] arr = new int[num];
     int sum = 0;
     for(int i=0;i<num;i++)
     {
     	arr[i]= in.nextInt();
       sum=sum + arr[i];
     }
     System.out.printf("The mean of the array is %.2f",(float)sum/num);
   }
 }