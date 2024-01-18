// this is the program to try way to concatenate the strings
public class S18
{
    public  static void main(String [] args)
    {
        String s1 = "pushpak mahendra";
        String s2 = " jaiswal";
        String s3 = s1.concat(s2);
        System.out.println(s3);
        StringBuffer s4 = new StringBuffer("pushpak mahendra");
        s4.append(" jaiswal");
        System.out.println(s4);
    }
}