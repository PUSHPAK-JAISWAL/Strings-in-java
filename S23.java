// this is a program to delete all the consonants from the string
public class S23
{
    public static void main(String []args)
    {
        String s1 = "Hello, have a good day";
        String s2 = s1.toLowerCase();
        for(int i=0;i<s2.length();i++)
        {
            if(s2.charAt(i)=='a'||s2.charAt(i)=='e'||s2.charAt(i)=='i'||s2.charAt(i)=='o'||s2.charAt(i)=='u')
            {
                System.out.print(s2.charAt(i));
            }
            else
            {
                System.out.print(" ");
            }
        }
    }
}