package collection;

import java.util.ArrayList;

public class CollectionArrayList {

	public static void main(String[] args) {          //Generic type
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(9);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		obj.add(7);
		//System.out.println(obj);
		for(int i:obj)    //for each loop
		{
			System.out.println(i);
		}
		

	}

}
