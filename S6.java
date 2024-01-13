// program to compare the values of the heap memory for the string
public class S6
{
    public static void main(String[]args)
    {
        String s1 = "pushpak mahendra jaiswal";
        String s2 = new String("pushpak mahendra jaiswal");
        String s3 = new String("pushpak mahendra jaiswal");
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s1.equals(s3));
    }
}