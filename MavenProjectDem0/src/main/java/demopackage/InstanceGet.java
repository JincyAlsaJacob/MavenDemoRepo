package demopackage;

public class InstanceGet {
	String a;
	 InstanceGet(String name)
	 {
		a=name; 
	 }
	 public void show()
	 {
		 System.out.println(a);
	 }

	public static void main(String[] args) {
		InstanceGet obj=new InstanceGet("JIncy");
		obj.show();

	}

}
