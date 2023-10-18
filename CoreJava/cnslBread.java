//Use BufferReader to read characters from the console

import java.io.*;
import java.util.*;


class cnslBread
{
	public static void main(String[] args)
	{
		char c ;
		BuffereReader br = new BuffereReader(new InputStreamReader(System.in));
		System.out.println("Enter Character 'q' to quite");
		
		do{
		
			c = (char) br.read();
			System.out.println(c);
		}while(c!='q');	
	}
}