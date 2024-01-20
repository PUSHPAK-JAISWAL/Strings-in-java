// this is a program to reverse a string without using the inbulit method
import java.util.Scanner;
public class S27
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the string to reverse");
        String s1 = sc.nextLine();
        char s2[] = s1.toCharArray();
        char s3[] = new char[s2.length];
        int j = s2.length-1;
        for(int i =0;i<s2.length;i++)
        {
            s3[j-i]=s2[i];
        }
        System.out.println(s3);
    }
}