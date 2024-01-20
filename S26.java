// this is a program to sort a string in the alphabetical order
import java.util.Arrays;
import java.util.Scanner;
public class S26
{
    public static void main(String [] args)
    {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter the string");
        String s2 = s1.nextLine();
        char a[] = s2.toCharArray();
        Arrays.sort(a);
        System.out.println(a);
    }
}