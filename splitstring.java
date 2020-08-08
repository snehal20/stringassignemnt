package string;

public class splitstring 
{
public static void main(String[]args)
{
String[] first="One two there four five six".split(" ");
String second=" ";
int i;



for(i=first.length-1;i>=0;i--)
{
	second +=first[i] + " ";
}
System.out.println(second);
}
}

