package interface_abstraction;

public class MultipleInhertanceSampChild implements MultipleInhertanceSampParent1,MultipleInhertanceSampParent2{
	public void show()
	{
		System.out.println("Encapsulation");
	}
public void display()
{
	System.out.println("Abstraction");
}
	public static void main(String[] args) {
		MultipleInhertanceSampChild obj=new MultipleInhertanceSampChild();
		obj.show();
		obj.display();

	}

}
