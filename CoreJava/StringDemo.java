 //Strings Streams files
 
/* why strings are immutable in java?
=>no alter,no update,can not be modified
				java.lang.Object
string class = java.lang.String*/

 class StringDemo
 {
	public static void main(String[] args)
	{
		String s1 = new String(); //empty string
		System.out.println("s1 = " +s1);
		
		char[] arr = {'a','b','c','d','e'};
		String s2 = new String(arr);
		System.out.println("s2 = " + s2);
		
		String s3 = new String(s2);
		if(s2==s3)
			System.out.println("s2 & s3 are equal referancs");
		if(s2.equals(s3))
			System.out.println("s2 and s3 have same contents");
		
		System.out.println(s2 + " startsWith abc: " + s2.startsWith("abc"));
		System.out.println(s2 + " EndsWith abc:  " + s2.endsWith("abc"));
		
		String s4 = "This is Original";
		System.out.println("s4 = "+ s4);
		
		System.out.println("After replacing i by x");
		String s5 = s4.replace('i','x');
		System.out.println("s4 = "+ s4);
		System.out.println("s5 = "+ s5);
		}
 }