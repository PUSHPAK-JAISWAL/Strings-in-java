//this is a program to reverse a string while preserving its position
import java.util.Scanner;
public class S25
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the string to reverse while preserving its position");
        String s1 = sc.nextLine();
        StringBuffer s2= new StringBuffer();
        String s3[] = s1.split(" ");
        for(String i:s3)
        {
            for( int j = i.length()-1;j>=0;j--)
            {
                s2.append(s1.charAt(j));
            }
            s2.append(" ");
        }
        System.out.println(s2);
    }
}