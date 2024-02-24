package inheritance;

public class InheritanceSample2 extends InheritanceSample{
	public void show()
	{
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
	InheritanceSample2 obj=new InheritanceSample2();
	obj.print();
	obj.show();
	}

}
