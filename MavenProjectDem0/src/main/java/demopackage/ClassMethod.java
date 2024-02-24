package demopackage;

public class ClassMethod {
	static int a=2;
	int b=3;
	public static void show()
	{
		int c=a+b;
		System.out.println("Sum is "+c);
	}

	public static void main(String[] args) {
		ClassMethod.show();

	}

}
