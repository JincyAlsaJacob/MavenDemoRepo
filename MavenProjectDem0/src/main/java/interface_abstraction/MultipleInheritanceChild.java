package interface_abstraction;

public class MultipleInheritanceChild implements MultipleInheritanceParent1,MultipleInheritanceParent2{
public void show()
{
	System.out.println("Inheritance");
}
	public static void main(String[] args) {
		MultipleInheritanceChild obj=new MultipleInheritanceChild();
		obj.show();

	}

}
