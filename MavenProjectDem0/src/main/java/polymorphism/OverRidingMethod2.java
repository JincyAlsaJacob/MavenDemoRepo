package polymorphism;

public class OverRidingMethod2 extends OverRidingMethod {
	public void show()
	{
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		OverRidingMethod2 obj=new OverRidingMethod2();
		obj.show();

	}

}
