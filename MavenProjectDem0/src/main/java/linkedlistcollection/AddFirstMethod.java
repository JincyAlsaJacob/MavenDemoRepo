package linkedlistcollection;

import java.util.LinkedList;

public class AddFirstMethod {

	public static void main(String[] args) {
	LinkedList<Integer> obj =new LinkedList<Integer>();
	obj.add(83);
	obj.add(56);
	obj.add(3);
	obj.add(91);
	System.out.println(obj);
	obj.addFirst(64);
	
 System.out.println(obj);
}
}