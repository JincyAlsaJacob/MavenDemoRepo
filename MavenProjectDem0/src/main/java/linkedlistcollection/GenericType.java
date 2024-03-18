package linkedlistcollection;

import java.util.LinkedList;

public class GenericType {

	public static void main(String[] args) {
		LinkedList<Integer> obj =new LinkedList<Integer>();
		obj.add(67);
		obj.add(45);
		obj.add(5);
		obj.add(11);
	//	System.out.println(obj);
		for(int b : obj)
		{
			System.out.println(b);
		}

	}

}
