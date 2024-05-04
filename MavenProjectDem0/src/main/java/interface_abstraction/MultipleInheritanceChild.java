package interface_abstraction;

public class MultipleInheritanceChild implements MultipleInheritanceParent1,MultipleInheritanceParent2{
	public void print()
	{
		System.out.println("OOP's Concept");
	}
public void show()
{
	System.out.println("Inheritance");
}
public void display()
{
	System.out.println("Multiple");
}
	public static void main(String[] args) {
		/*MultipleInheritanceChild obj=new MultipleInheritanceChild();
		obj.print();
		obj.display();
		obj.show();*/
		MultipleInheritanceParent2 obj1 =new MultipleInheritanceChild();
		obj1.display();
		

	}

}
