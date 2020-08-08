package string;

public class specialchar 
{
	public static void main(String args[])   
	{  
	String str= "#%$#%$*!! Hello There *&*&%$%$^ good";   
	str = str.replaceAll("[^a-zA-Z0-9]",  "");  
	System.out.println(str);  
	}  
	}  

