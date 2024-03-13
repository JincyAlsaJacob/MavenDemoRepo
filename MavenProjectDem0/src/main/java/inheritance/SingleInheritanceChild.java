package inheritance;

public class SingleInheritanceChild extends SingleInheritanceParent {
	public void show()
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		SingleInheritanceChild obj =new SingleInheritanceChild();
		obj.add();
		obj.show();	

	}

}
