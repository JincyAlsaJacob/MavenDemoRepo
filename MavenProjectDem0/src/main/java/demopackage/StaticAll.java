package demopackage;

public class StaticAll {
	public static void show(String a,float b)
	{
		System.out.println("My name is "+a);
		System.out.println("Time is "+b);
	}
	public static void add()
	{
		int a=2;
		int b=3;
		int c=a+b;
		System.out.println("sum is "+c);
	}
public static int mul(int a,int b)
{
	int c=a*b;
	return(c);
}
	public static void main(String[] args) {
		StaticAll.show("Jincy", 3.4f);	
		StaticAll.add();
		System.out.println(StaticAll.mul(5, 6));
		

	}

}
