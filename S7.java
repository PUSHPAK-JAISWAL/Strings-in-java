// this program is to show use of the the methods string concat() and the + operator
public class S7 
{ 
    public static void main(String[] args)
    {
        String s1 = " pushpak ";
        String s2 = " mahendra ";
        String s3 = " jaiswal";
        System.out.println(s1+s2+s3);
        System.out.println(s1.concat(s3));
        System.out.println((s1.concat(s2)).concat(s3));
    }
}