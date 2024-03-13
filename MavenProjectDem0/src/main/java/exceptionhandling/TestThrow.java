package exceptionhandling;

public class TestThrow {
	public void show(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Person is not eligible to vote");
		}
		else
		{
			System.out.println("Person is eligible to vote");
		}
	}

	public static void main(String[] args) {
		TestThrow obj=new TestThrow();
		obj.show(10);
		

	}

}
