package demopackage;

public class ThisMethod {
	public void show(int a,int b)
	{
		int c=a+b;
		display();
		System.out.println(c);
	}
	public void display()
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		ThisMethod obj=new ThisMethod();
		obj.show(2,3);

	}

}
