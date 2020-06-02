import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();  
        int b=obj.nextInt();
        int temp=0;
        
        temp=a;
        a=b;
        b=temp;
        
        System.out.println(a+"\n"+b);
    }
}