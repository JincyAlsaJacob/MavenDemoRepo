package demopackage;

public class StringReversalForloop {

	public static void main(String[] args) {
		String a="malayalam";
		String b="";
		for(int i=8;i>=0;i--)
		{
		b=b+a.charAt(i);
				
		}
		System.out.println(b);
	if(a.equals(b))
	{
System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not Palindrome");
	}

}
}
