//args = takes extensions

import java.io.*;

class file6
{
	public static void main(String args[])
	{
		int cnt =0;
		File dir = new File(args[0]);
		String files[] = dir.list();
		
		for(int i=0; i < files.length; i++)
		{
			File f = new File(args[0]+ "\\" + files[i]);
			if(f.isFile() && files[i].endsWith(args[1])==true)
			{
				f.delete();
				cnt++;
			}
		}
		System.out.println("No of files deleted : " +cnt);
		
	}
}