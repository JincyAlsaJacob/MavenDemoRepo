package demopackage;

public class ThisExample {
	int a;
	int b;
	ThisExample(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void add()
	{
		int c=a+b;
		System.out.println("Sum is"+c);
	}

	public static void main(String[] args) {
		ThisExample obj=new ThisExample(4,5);
		obj.add();
		
	}

}
