package collection;

import java.util.ArrayList;

public class PrintWithForLoop {

	public static void main(String[] args) {
		ArrayList<String> obj=new ArrayList<String>();
obj.add("Apple");
obj.add("Mango");
obj.add("Grapes");
obj.add("Banana");

for(int i=0;i<obj.size();i++)
{
	System.out.println(obj.get(i));
}
	}

}
