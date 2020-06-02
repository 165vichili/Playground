import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
    int a=obj.nextInt();
    int b=obj.nextInt();
    
    if(a<b)
    {
        System.out.println(a+" less than "+b);
    }
    if(a>b)
    {
        System.out.println(a+" greater than "+b);
    }
    if(a==b)
    {
        System.out.println(a+" and "+b+" are equal");
    }
}
}