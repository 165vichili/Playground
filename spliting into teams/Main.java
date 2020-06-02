import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
int a=obj.nextInt();
int b=obj.nextInt();
    int num=a/b;
    int rem=a%b;
    
    System.out.println("The number of students in each team is "+num+" and left out is "+rem);
}
}