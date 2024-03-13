package exceptionhandling;

public class ArithmeticExceptionProg1 {
public void show()
{
	try
	{
		int a=2/0;
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	System.out.println("Exception Handled");
}
}
