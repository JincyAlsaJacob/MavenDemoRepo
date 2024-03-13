package exceptionhandling;

public class NullPointerExceptionProg {
	public void show()
	{
		try
		{
			String a=null;
			System.out.println(a.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		System.out.println("Exception Handled");
	}

	public static void main(String[] args) {
		NullPointerExceptionProg obj=new NullPointerExceptionProg();
		obj.show();
		

	}

}
