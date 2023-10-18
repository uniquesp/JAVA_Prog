
//String = "Hello My Name is Nitin"
//Find the count of palindrome str

import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static int countPalindromeWords(String s) 
	{
        s = s.toLowerCase();
        s = s.trim();
        int count = 0;
        StringTokenizer st = new StringTokenizer(s," ");
        while(st.hasMoreTokens()){
            String word = st.nextToken();
            if(IsPalindrome(word)){
                count++;
            }
        }

        return count;
    }

    public static boolean IsPalindrome(String w){
        String rev = "";
        for(int i=0;i<w.length();i++){
            rev = w.charAt(i)+rev;
        }
	
        if(rev.equals(w)){
            return true;
        }
        return false;
    }
	
	public static void main(String args[]){
		String str = " Hello My Name Is Nitin";
		System.out.println(countPalindromeWords(str));
	}
}
	
	
	
	
	
	
