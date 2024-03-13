package interface_abstraction;

public interface InterfaceClassChild1 extends InterfaceClassParent{
	default void show()
	{
		System.out.println("India");
	}
void display();
}
