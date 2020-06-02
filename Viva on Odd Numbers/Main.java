import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        float mark=0;
        int count=0;
        int n=0;
        Scanner scan=new Scanner(System.in);
        //n=scan.nextInt();
        while(n>=0){
            if(count==3)
            {
                break;
            }
            n=scan.nextInt();
            if(n%2!=0 && n>=0)
            {
                ++mark;
                ++count;    
            }
          else if(n<0)
          {
              mark=(float)(mark-1);
           }
          else
           {
              mark=(float)(mark-0.5);
           }
               
        }
        System.out.printf("%.1f",mark);
        //System.out.println(count);   
    }
}