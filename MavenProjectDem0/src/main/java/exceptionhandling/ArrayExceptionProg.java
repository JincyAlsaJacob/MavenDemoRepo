package exceptionhandling;

public class ArrayExceptionProg {
	public void show()
	{
		try
		{
			int a[]=new int[5];
			a[8]=6;
		
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("Exception Handled");
	}

	public static void main(String[] args) {
		ArrayExceptionProg obj=new ArrayExceptionProg();
		obj.show();
		

	}

}
