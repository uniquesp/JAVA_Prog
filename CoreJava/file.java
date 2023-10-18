//create a new file 
import java.io.*;
class file
{
	public static void main(String args[]) throws Exception
	{
		String str="";
		FileOutputStream out;
		PrintStream p;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//out = new FileOutputStream(args[0]); //write mode
		out = new FileOutputStream(args[0],true);//append mode
		
		p = new PrintStream(out);
		System.out.println("Enter Lines of text.(Ener 'Stop' to quit)");
		
		while(!str.equals("Stop"))
		{
			p.println(str);
			str = br.readLine();
		}
		
	}
}