import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
         Scanner obj=new Scanner(System.in);
        int base=obj.nextInt();
        System.out.println((base%2==0) ? "Even" : "Odd");
    }
}