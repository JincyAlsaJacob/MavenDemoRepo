package heirarchicalinheritance;

public class Cat extends Animal{
	public void done()
	{
		System.out.println("hi");
	}

	public static void main(String[] args) {
		Cat obj=new Cat();
		obj.show();
		obj.done();
		Dog obj1=new Dog();
		obj1.display();
		obj1.show();

	}

}
