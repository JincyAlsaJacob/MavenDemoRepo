package demopackage;

public class StringBufferInsertDemo {

	public static void main(String[] args) {
		StringBuffer obj=new StringBuffer("Welcome");
		obj.insert(2, "hi");
		System.out.println(obj);

	}

}
