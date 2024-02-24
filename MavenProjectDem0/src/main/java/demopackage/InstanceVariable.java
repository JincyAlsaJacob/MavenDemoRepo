package demopackage;

public class InstanceVariable {
	static int a=2;
	int b=3;
	public void show()
	{
		int c=a+b;
		System.out.println("Sum is"+c);
	}

	public static void main(String[] args) {
		InstanceVariable obj=new InstanceVariable();
		obj.show();

	}

}
