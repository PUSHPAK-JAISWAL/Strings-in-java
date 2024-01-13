// program to check values from string constant pool
public class S5 
{
    public static void main(String[]args)
    { 
        String s1 = " pushpak mahendra jaiswal";
        String s2 = " pushpak mahendra jaiswal";
        String s3 = " pushpak";
        System.out.println(s1==s2);
        System.out.println(s1==s3 && s2==s3);
    }
}