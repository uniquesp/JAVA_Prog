//StringBuffer 
// Diff bet String & StringBuffer
//capasity bydefault: string=0 StringBuff=16
//					Strings=immutatble  StringBuff=not immutatble
class StringBufferDemo
{
	public static void main(String[] args)
	{
		StringBuffer s1 = new StringBuffer("");
		System.out.println("Length of s1 = "+ s1.length());
		System.out.println("Capacity of s1 = "+ s1.capacity()); //by default 16
	
		StringBuffer s2 = new StringBuffer("java");
		System.out.println("Length of s1 = "+ s2.length());
		System.out.println("Capacity of s1 = "+ s2.capacity()); //by default 16
	
		s2.append("program");
		System.out.println("After Appending = " + s2); //it add at last javaprogram
		
		s2.insert(0,"Simple"); //give index where to insert
		System.out.println("After inserting = " + s2); 
		
		s2.delete(6,10); //from which index to which
		System.out.println("After deletinging = " + s2); 
		
		s2.reverse();
		System.out.println("After reversing s2 = "+s2);
		
		
	}
}