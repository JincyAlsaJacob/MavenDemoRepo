package exceptionhandling;

public class NumberFormatExceptionProg {
	public void show()
	{
		try
		{
			String str="Hello";
			int num=Integer.parseInt(str);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		System.out.println("Exception Handled");
	}

	public static void main(String[] args) {
		NumberFormatExceptionProg obj=new NumberFormatExceptionProg();
		obj.show();

	}

}
