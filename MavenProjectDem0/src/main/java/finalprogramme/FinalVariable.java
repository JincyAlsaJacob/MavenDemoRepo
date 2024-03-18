package finalprogramme;

public class FinalVariable {
	final int a=4;
	public void show()
	{
	a=5;
		System.out.println("Number is "+a);
	}

	public static void main(String[] args) {
		FinalVariable obj=new FinalVariable();
		obj.show();

	}

}
