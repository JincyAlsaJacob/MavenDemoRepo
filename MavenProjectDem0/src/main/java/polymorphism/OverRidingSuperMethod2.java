 package polymorphism;

public class OverRidingSuperMethod2 extends OverRidingSuperMethod {
public void show()
{
	System.out.println("All");
	super.show();
}
	public static void main(String[] args) {
		OverRidingSuperMethod2 obj=new OverRidingSuperMethod2();
		obj.show();
		
		

	}

}
