package demopackage;

public class InstanceAll {
	public void show()
	{
		System.out.println("Hi");
	}
	public int add(int a,int b)
	{
		int c=a+b;
		return(c);
	}
	public void mul()
	{
	int a=2;
	int b=3;
	int c=a*b;
	System.out.println(c);
	}

	public static void main(String[] args) {
		InstanceAll obj=new InstanceAll();
		obj.show();
		System.out.println(obj.add(2,3));
		obj.mul();
		

	}

}
