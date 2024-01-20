// this is a program to convert uppercase and lowercase and vice versa
import java.util.Scanner;
public class S29
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = sc.nextLine();
        String s2 = "";
        for(int i =0; i<s1.length();i++)
        {
            if ((s1.charAt(i)>='a') && (s1.charAt(i)<='z'))
            {
                s2=s2+ (char) (s1.charAt(i)-32);
            }
            else if((s1.charAt(i)>='A') && (s1.charAt(i)<='Z'))
            {
                s2=s2+ (char) (s1.charAt(i)+32);
            }
        }
        System.out.println(s2);
    }
}