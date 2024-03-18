package collection;

import java.util.ArrayList;

public class RemoveMethod {

	public static void main(String[] args) {
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(3);
		obj.add(8);
		obj.add(6);
		obj.add(1);
		obj.add(5);
		System.out.println(obj);
		obj.remove(3);
System.out.println(obj);
	}

}
