package setcollection;

import java.util.HashSet;

public class ContainsMethod {

	public static void main(String[] args) {
		HashSet<String> obj = new HashSet<String> ();
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Banana");
		System.out.println(obj.contains("Orange"));

	}

}
