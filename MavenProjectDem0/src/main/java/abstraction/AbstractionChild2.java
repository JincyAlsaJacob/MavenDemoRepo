package abstraction;

public class AbstractionChild2 extends AbstractionChild1 {
	public void quit()
	{
		System.out.println("State");
	}
public void give()
{
	System.out.println("Birds");
}
	public static void main(String[] args) {
		AbstractionChild2 obj=new AbstractionChild2();
		obj.show();
		obj.display();
		obj.give();
		obj.done();
		obj.quit();

	}

}
