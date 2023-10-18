//using directories

import java.io.File;

class file5
{
	public static void main(String args[])
	{
		int fc=0, dc=0;
		String dirname=args[0];
		File f1 = new File(dirname);
		
		if (f1.isDirectory())
		{
			System.out.println("Directory of " + dirname);
			String a[] = f1.list(); //imp method
			
			for(int i=0; i < a.length; i++)
			{
				File f = new File(dirname + "/" + a[i]);
				if(f.isDirectory())
				{
					System.out.println(a[i] + " is a Directory");
					dc++;
				}
				else
				{
					System.out.println(a[i] + " is a File");
					fc++;
				}
			}
			System.out.println("\n\t TOtal Number of Directory =  "+dc);
			System.out.println("\n\t TOtal Number of Files =  "+fc);
		}
		else
		{
			System.out.println(dirname+" Is Not a Directory");
		
		}
	
	}



}