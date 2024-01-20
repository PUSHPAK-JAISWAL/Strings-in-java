// this is a program to remove a specific character from a give string 
import java.util.Scanner;
public class S30
 {
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the string");
		String s1 = sc.nextLine();
		System.out.println(remove(s1, 3));
	}

	public static String remove(String s, int pos)
	{
		return s.substring(0, pos) + s.substring(pos + 1);
	}
}