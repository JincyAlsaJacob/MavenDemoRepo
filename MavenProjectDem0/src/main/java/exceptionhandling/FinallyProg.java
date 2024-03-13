package exceptionhandling;

public class FinallyProg {

	public static void main(String[] args) {
	try
	{
		int a=5/0;
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
finally
{
	System.out.println("Finally block always executed");
}
	}

}
