import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        float x=obj.nextFloat();
        float y=obj.nextFloat();
        float a=obj.nextFloat();
        float b=obj.nextFloat();
        float d=obj.nextFloat();
        
    	float c=(x+y+a+b+d)/5;
    
    	System.out.printf("%.2f",c);
    }
}