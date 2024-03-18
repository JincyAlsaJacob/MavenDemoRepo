package collection;

import java.util.ArrayList;

public class SetMethod {

	public static void main(String[] args) {
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Apple");
		obj.add("Mango");
		obj.add("Orange");
		obj.add("Grapes");
		System.out.println(obj);
		obj.set(1, "Banana");
		System.out.println(obj);
		

	}

}
