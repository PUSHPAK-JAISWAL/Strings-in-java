import java.util.Scanner;
public class S24
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string to reverse");
        String s1 = sc.nextLine();
        StringBuffer s2 = new StringBuffer();
        s2.append(s1);
        System.out.println("the reverse of the string :- "+s1+"is as :-"+s2.reverse());
    }
}