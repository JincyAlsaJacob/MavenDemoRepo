package exceptionhandling;

public class MultipleCatchBlockProg {
	public void show()
	{
		try
		{
			int a=5/0;
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("Exception Handled");
	}

	public static void main(String[] args) {
		
		MultipleCatchBlockProg obj=new MultipleCatchBlockProg();
		obj.show();
	}

}
