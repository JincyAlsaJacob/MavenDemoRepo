package inheritance;

public class MultilevelInheritanceC extends MultilevelInheritanceB {
	public void display()
	{
		System.out.println("welcome");
	}

	public static void main(String[] args) {
		MultilevelInheritanceC obj=new MultilevelInheritanceC();
		obj.display();	
		obj.add(2,6);
		obj.mul();
		System.out.println("Sum is "+obj.add1(4, 5));
	}

}
