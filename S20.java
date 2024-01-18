// this is a program to compare the use of == and the equals() metheod
public class S20 
{
    public static void main(String []args)
    {
        String s1= "pushpak mahendra jaiswal";
        String s2= "pushpak mahendra jaiswal";
        StringBuffer s3= new StringBuffer("pushpak mahendra jaiswal");
        StringBuffer s4= new StringBuffer("pushpak mahendra jaiswal");
        System.out.println(s1==s2);
        System.out.println(s3==s4);
        System.out.println(s2.equals(s3));
    }
}