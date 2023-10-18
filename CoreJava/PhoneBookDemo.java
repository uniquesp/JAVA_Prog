//Random access file
//UTF => Uniform Transformation Format

import java.io.*;
import java.lang.*;

class PhoneBook
{
	String name,phone;
	PhoneBook()
	{
		name = phone = null;
	}
	PhoneBook(String name, String phone)
	{
		this.name = name;
		this.phone = phone;
	}
	long store(RandomAccessFile f) throws Exception
	{
		long pos = f.getFilePointer();
		f.writeUTF(name);
		f.writeUTF(phone);return pos;
	}
	void access (RandomAccessFile f) throws Exception
	{
		name = f.readUTF();
		phone = f.readUTF();
		System.out.println("\n\t Name = "+name+", Phone = "+phone);
	}
}

class PhoneBookDemo
{
	public static void main(String args[]) throws Exception
	{
		String name,phone;
		int n,i;
		RandomAccessFile f = new RandomAccessFile("phone.txt","rw");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PhoneBook p;
		
		System.out.println("How many Entries you want");
		n = Integer.parseInt(br.readLine());
		
		String nameTable[] = new String[n];
		long posTable[] = new long[n];
		
		for(i=0;i<n;i++)
		{
			System.out.println("\n\t Enter Name & Phone Number = ");
			name = br.readLine();
			phone = br.readLine();
			
			p = new PhoneBook(name,phone);
			nameTable[i] = name;
			posTable[i] = p.store(f);
		}
		f.close();
		
		boolean done = false;
		RandomAccessFile f1 = new RandomAccessFile("phone.txt","r");
		PhoneBook p1 = new PhoneBook();
		
		while(!done)
		{
			System.out.println("\n\t Enter The Name To Search:  ");
			name = br.readLine();
			boolean found = false;
			 
			for(i=0;i<n;i++)
			{
				if(nameTable[i].equals (name))
				{
					f1.seek(posTable[i]);
					p1.access(f1);
					found = true;
				}
			}
			if(!found)
			System.out.println("*****Record Not Exist*****");
			
			System.out.println("Do you Want to Search another Record  yes/No? ");
			String ans = br.readLine();
			if(ans.equals("n"))
			done = true;
		}
		f1.close();
			
		
		
	}
}


