package setcollection;

import java.util.HashSet;

public class RemoveMethod {

	public static void main(String[] args) {
		HashSet<String> obj =new HashSet<String> ();
		obj.add("Apple");
		obj.add("Banana");
		obj.add("Grapes");
		obj.add("Orange");
		obj.remove("Grapes");
		System.out.println(obj);

	}

}
