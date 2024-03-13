package polymorphism;

public class OverRidingSuperVariable2 extends OverRidingSuperVariable {
String name="welcome";
public void show()
{
	System.out.println(name);
	System.out.println(super.name);
}
	public static void main(String[] args) { 
		OverRidingSuperVariable2 obj=new OverRidingSuperVariable2();
		obj.show();
		

	}

}
