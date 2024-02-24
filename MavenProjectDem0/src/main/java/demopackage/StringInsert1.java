package demopackage;

public class StringInsert1 {

	public static void main(String[] args) {
		StringBuffer obj=new StringBuffer("goodmorning");
		obj.replace(0,3,"hello");
		System.out.println(obj);

	}

}
