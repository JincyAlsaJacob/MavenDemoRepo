package polymorphism;

public class Superconstructor2 extends Superconstructor {
	Superconstructor2()
	{
		super();
		System.out.println("Orange");
		
	}

	public static void main(String[] args) {
		Superconstructor2 obj=new Superconstructor2();

	}

}
