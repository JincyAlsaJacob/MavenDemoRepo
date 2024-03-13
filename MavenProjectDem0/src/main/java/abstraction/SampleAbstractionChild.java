package abstraction;

public class SampleAbstractionChild extends SampleAbstraction{
	public void done()
	{
		System.out.println("Vegetables");
		
	}
	public void display()
	{
		System.out.println("Animals");
	}
	public static void main(String[] args) {
		
		SampleAbstractionChild obj=new SampleAbstractionChild();
		obj.done();
		obj.display();
		obj.show();
		
		
		

		
		

	}




	}


