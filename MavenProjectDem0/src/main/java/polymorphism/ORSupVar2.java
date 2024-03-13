package polymorphism;

public class ORSupVar2 extends ORSupVar1 {
	String name="Programme";
	public void show()
	{
		
		System.out.println(name);
		System.out.println(super.name);
	}

	public static void main(String[] args) {
		ORSupVar2 obj=new ORSupVar2();
		obj.show();
		

	}

}
