// this is the program to find the index of substring
import java.util.Scanner;
public class S31
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the string");
        String s1 = sc.nextLine();
        System.out.println(" enter the substring to find index of in the string");
        String s2 = sc.nextLine();
        int i = s1.indexOf(s2);
        if( i == -1 )
        {
            System.out.println(" the substring is not present in the string");
        }
        else
        {
            System.out.println(" the index of substring in the string is :- "+i);
        }
    }
}