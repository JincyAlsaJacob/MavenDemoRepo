package demopackage;

public class ThisConstructor {
	ThisConstructor()
	{
		System.out.println("hi");
	}
	ThisConstructor(String name)
	{
		this();
		System.out.println(name);
	}

	public static void main(String[] args) {
		ThisConstructor obj=new ThisConstructor("Jincy");
	}

}
