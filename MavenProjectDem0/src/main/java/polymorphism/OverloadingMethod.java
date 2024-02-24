package polymorphism;

public class OverloadingMethod {
	public void display()
	{
		System.out.println("hello");
	}
	public void display(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		
	}
public void display(float a,float b)
{
	float c=a+b;
	System.out.println(c);
}
	public static void main(String[] args) {
		OverloadingMethod obj=new OverloadingMethod();
		obj.display();
		obj.display(3,4);
		obj.display(2.3f,4.5f);

	}

}
