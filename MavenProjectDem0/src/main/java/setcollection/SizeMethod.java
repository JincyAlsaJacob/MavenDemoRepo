package setcollection;

import java.util.HashSet;
import java.util.Iterator;



public class SizeMethod {

	public static void main(String[] args) {
		HashSet obj =new HashSet ();
		obj.add(56);
		obj.add(31);
		obj.add(82);
		obj.add(3);
		//System.out.println(obj.size());
		Iterator itr = obj.iterator();
		while(itr.hasNext())   
		{
			System.out.println(itr.next());      // Printing the element and move to next
		}

	}

}
