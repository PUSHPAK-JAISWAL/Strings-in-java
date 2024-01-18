// this is the program to show case the use of the mutable strings by StringBuffer
public class S15
{
    public static void main(String [] args)
    {
        StringBuffer sb = new StringBuffer("Pushpak");
        System.out.println(sb);
        sb.append(" Mahendra");
        System.out.println(sb);
        sb.append(" Jaiswal");
        System.out.println(sb);
    }
}