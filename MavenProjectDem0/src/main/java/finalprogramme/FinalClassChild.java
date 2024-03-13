package finalprogramme;

public class FinalClassChild extends FinalClassParent{
	public void display()
	{
		System.out.println("Birds");
	}

	public static void main(String[] args) {
		FinalClassChild obj=new FinalClassChild();
		obj.display();
		obj.show();
		

	}

}
