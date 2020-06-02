import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int num= in.nextInt();
    int[] arr= new int[num];
    for(int i=0;i<num;i++)
      arr[i] = in.nextInt();
    int distinct =0;
    for(int i=0;i<num;i++)
    {
    	boolean flag = false; 
      	for(int j=0;j<num;j++)
        {
        	if(i==j)
              continue;
          else if((arr[i]!=arr[j])&&(i<j))
            flag = true;
        }
      if(flag)
        distinct++;
    }
    System.out.print(distinct);
  }
}