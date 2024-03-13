package heirarchicalinheritance;

public class HeirarchyC extends HeirarchyA {
	public int mul(int a,int b)
	{
		int c=a*b;
		return(c);
	}

	public static void main(String[] args) {
		HeirarchyC obj1=new HeirarchyC();
	System.out.println("Product is "+obj1.mul(5, 8));
	HeirarchyB obj2=new HeirarchyB();
	obj2.show();
	obj2.add();
		

	}

}
