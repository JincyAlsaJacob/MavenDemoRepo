package demopackage;

public class StaticOverload {
	public static void show(int a)
	{
		System.out.println(a);
	}
	public static void show(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		StaticOverload.show(4);
		StaticOverload.show(5,6);
		

	}

}
