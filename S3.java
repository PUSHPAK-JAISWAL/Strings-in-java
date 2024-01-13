// program to write different types of inmutable string
public class S3 
{
    public static void main(String[]args)
    {
        String s = "pushpak mahendra jaiswal";// this is the first type of declaration of string
        String s2 = new String("pushpak mahendra jaiswal");// this is the second type of string declaration
        char s3[] = { 'p','u','s','h','p','a','k'};
        String s4 = new String(s3);// this is the third type of string declaration
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s4);
    }
}