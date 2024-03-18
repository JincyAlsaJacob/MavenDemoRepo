package collection;

import java.util.ArrayList;

public class ClearMethod {

	public static void main(String[] args) {
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(45);
		obj.add(67);
		obj.add(42);
		obj.add(4);
		obj.add(6);
		System.out.println(obj);
		obj.clear();
		System.out.println(obj);

	}

}
