import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner obj=new Scanner(System.in);
        char c=obj.next().charAt(0);
        
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'|| c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
        {
            System.out.println("Vowel");
        }
        
        else if((c>=65 && c<=90 ) || (c>=97 && c<=122))
        {
           System.out.println("Consonant"); 
        }
        else
        {
           System.out.println("Not an alphabet");  
        }
    }
}