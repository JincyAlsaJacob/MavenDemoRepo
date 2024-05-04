package aggregation;

public class UserDetails {
	String name;
	int age;
	UserAddress refer;
	UserDetails(String name, int age, UserAddress refer)
	{
		this.name=name;
		this.age=age;
		this.refer=refer;
	}
	public void show()
	{
		System.out.println("Name       : "+"  "+name);
		System.out.println("Age        : "+"  "+age);
		System.out.println("Housename  : "+"  "+refer.housename);
		System.out.println("Street     : "+"  "+refer.street);
		System.out.println("Postoffice : "+"  "+refer.postoffice);
		System.out.println("Pincode    : "+"  "+refer.pincode);
		System.out.println("District   : "+"  "+refer.district);
		System.out.println("State      : "+"  "+refer.state);
	}

	
	public static void main(String[] args) {
		UserAddress obj=new UserAddress("Abcdhouse", "Ktrlane","Pallickal",123456,"Kollam","Kerala");
		UserDetails us=new UserDetails("Arun",45,obj);
		us.show();
		
		
		
		

	}

}
