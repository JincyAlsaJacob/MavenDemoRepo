package polymorphism;

public class SuperConstructorSample2 extends SuperConstructorSample1 {
	SuperConstructorSample2(String name)
	{
		super();
		System.out.println(name);
	}

	public static void main(String[] args) {
		SuperConstructorSample2 obj =new SuperConstructorSample2("Fruits");
		

	}

}
