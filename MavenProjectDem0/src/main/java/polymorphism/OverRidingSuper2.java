package polymorphism;

public class OverRidingSuper2 extends OverRidingSuper {
String name="welcome";
public void show()
{
	System.out.println(name);
	System.out.println(super.name);
}
	public static void main(String[] args) { 
		OverRidingSuper2 obj=new OverRidingSuper2();
		obj.show();
		

	}

}
