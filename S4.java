// program to compare strings by the method of == operator and equals() funtion
public class S4 
{ 
    public static void main(String[]args)
    {
        String s1= " pushpak mahendra jaiswal";
        String s2= new String(" pushpak mahendra jaiswal");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}