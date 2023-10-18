import java.io.*;
class file4
{
	static void p(String s)
	{
		System.out.println(s);
	}
	public static void main(String args[])
	{
		File f1 = new File(args[0]);
		
		p("File name:" +f1.getName());
		p("Path: " +f1.getPath());
		p("Aba Path: " +f1.getAbsolutePath());
		p("Parent: "+f1.getParent());
		p(f1.exists() ? "It is exists" : "It does'nt Exists");
		p(f1.canWrite() ? "It is Writable" : "It does'nt Writable");
		p(f1.canRead() ? "It is Readable" : "It does'nt Readable");
		p("It is" + (f1.isDirectory() ? "Directory" : "Not a Directory"));
		p(f1.isFile() ? "It is a normal file" : "It might be a named file");
		p("File last modified: " + f1.lastModified());
		p("File Size: " +f1.length() + "Bytes");
	}
}