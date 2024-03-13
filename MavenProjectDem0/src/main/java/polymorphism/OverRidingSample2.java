package polymorphism;

public class OverRidingSample2 extends OverRidingSample {
	public void show()
	{
		System.out.println("Hello");    //Since the method names are same,the output in child class only will show.
	}                                    //To get output from parent class 'super' keyword is used

	public static void main(String[] args) {
		OverRidingSample2 obj=new OverRidingSample2();
		obj.show();

	}

}
