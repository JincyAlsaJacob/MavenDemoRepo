package interface_abstraction;

public class InterfaceClassChild2 implements InterfaceClassChild1 {
	public void display()
	{
		System.out.println("America");
	}

	public static void main(String[] args) {
		InterfaceClassChild2 obj=new InterfaceClassChild2();
		obj.show();
		obj.display();

	}

}
