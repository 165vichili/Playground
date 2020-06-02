import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int [] arr = new int[num];
      for(int i=0;i<num;i++)
        arr[i]=in.nextInt();
      int key = in.nextInt();
      boolean found = false;
      for(int i=0;i<num;i++)
        if(key == arr[i])
          found = true;
      if(found)
        System.out.print(key+" is present in the array");
      else
        System.out.print(key+" is not present in the array");
    }
}