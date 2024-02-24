package inheritance;

public class CClass extends BClass {
	public void display()
	{
		System.out.println("Hi");
	}

	public static void main(String[] args) {
		CClass obj=new CClass();
		obj.show();
		obj.print();
		obj.display();
	}

}
