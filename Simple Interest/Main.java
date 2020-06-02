import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int amt=obj.nextInt();
        int prd=obj.nextInt();
        float rate=obj.nextFloat();
        
       	float si;
        si=(amt*prd*rate)/100;
        System.out.printf("%.02f",si);
    }
}