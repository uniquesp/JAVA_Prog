//palimdrome no 
import java.util.*;
class Palindrome
{
	public static void main(String[] args)
	{
		System.out.println("String S1= ");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		
		

		StringBuffer s2 = new StringBuffer(s1);
		s2.reverse();
		
		String s3 = new String(s2);
		if(s1.equals(s3))
		{
			System.out.println("String is palindrome ");
		}
		else
		{
			System.out.println("String is NOTpalindrome");
		}
	
	}
}