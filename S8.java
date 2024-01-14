// this program is for complex operations with equals() method and concat() method
public class S8
{
    public static void main(String[]args)
    {
        String s1 = "pushpak mahendra jaiswal";
        String s2 = "pushpak ";
        String s3 = "mahendra ";
        String s4 = "jaiswal";
        System.out.println((s2.concat(s3)).concat(s4));
        System.out.println(s1.equals((s2.concat(s3)).concat(s4)));
    }
}