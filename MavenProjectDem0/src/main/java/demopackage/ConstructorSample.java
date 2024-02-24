package demopackage;

public class ConstructorSample {
	ConstructorSample()
	{
		int a=3;
		int b=4;
		int c=a+b;
		System.out.println("Sum is "+c);
	}
	ConstructorSample(String a,int b)
	{
		System.out.println("My name is "+a);
		System.out.println("My age is "+b);
	}

	public static void main(String[] args) {
		ConstructorSample obj1=new ConstructorSample();
		ConstructorSample obj2=new ConstructorSample("Jincy",23);

	}

}
