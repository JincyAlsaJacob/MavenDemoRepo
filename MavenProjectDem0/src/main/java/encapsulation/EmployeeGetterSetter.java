package encapsulation;

public class EmployeeGetterSetter {

	public static void main(String[] args) {
		EmployeeEncapsulation obj=new EmployeeEncapsulation(); //Aggregation
		obj.setName("Jincy");
		obj.setAge(30);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());

	}

}
