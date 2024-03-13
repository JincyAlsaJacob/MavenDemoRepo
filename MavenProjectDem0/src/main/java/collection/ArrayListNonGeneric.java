package collection;

import java.util.ArrayList;

public class ArrayListNonGeneric {
 
	public static void main(String[] args) {       //NonGeneric type
		ArrayList obj=new ArrayList();
		obj.add("Hello");
		obj.add(6);
		obj.add(1.6f);
		obj.add('g');
System.out.println(obj);
	}

}
