

class FormatDemo
{
	public static void main(String[] args)
	{
		Double PIVal = Math.PI;
		System.out.format("%f\n",PIVal);
		System.out.format("%.2f\n",PIVal);
		System.out.format("%f\n",10.34555553);
		System.out.format("%f\n",10.34555553);
		System.out.format("%.10f\n",10.3455555322);
		System.out.format("%.10f\n",10.34555553);
		
		String s = "My name is sakshi";
		String str = String.format("%s",s);
		System.out.println(str);
		
		String str1 = String.format("%20s",s);
		System.out.println(str1);
		
		String str2 = String.format("% -50s","I am");
		System.out.println(str2 + "*");
			
	}
}