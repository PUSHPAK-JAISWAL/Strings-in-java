// this is a program to check if the give string is palindrome
import java.util.Scanner;
public class S28
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string to test");
        String s1 = sc.nextLine();
        String s2 = ""; 
        int i = s1.length();
        for( int j = i-1;j>=0;j--)
        {
            s2 = s2+s1.charAt(j);
        }
        if ( s1.equals(s2))
        {
            System.out.println(" The string is palindrome ");
        }
        else
        {
            System.out.println(" The String is not a palindrome");
        }
    }
}