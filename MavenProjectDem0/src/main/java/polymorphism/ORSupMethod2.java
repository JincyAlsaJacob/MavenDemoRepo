package polymorphism;

public class ORSupMethod2 extends ORSupMethod1{
	public void add()
	{
		int a=6;
		int b=8;
		int c=a*b;
		System.out.println("Product is "+c);
		super.add();
	}

	public static void main(String[] args) {
		ORSupMethod2 obj=new ORSupMethod2();
		obj.add();

	}

}
