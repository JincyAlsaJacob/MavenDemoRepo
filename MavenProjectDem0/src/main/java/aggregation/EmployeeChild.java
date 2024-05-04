package aggregation;

public class EmployeeChild {
	String name;
	int ID;
	AddressParent address; //Aggregation globally declared
	EmployeeChild(String name, int ID,AddressParent address)
	{
		this.name=name;
		this.ID=ID;
		this.address=address;
		
	}
	public void show()
	{
		System.out.println("name"+"  "+name+"   "+"ID"+"  "+ID);
		System.out.println(address.country+"    "+address.state+"   "+address.city);
	
	}

	public static void main(String[] args) {
		
		AddressParent obj=new AddressParent("India","Kerala","Kollam");
		AddressParent obj1=new AddressParent("India","Mumbai","Pune");
		EmployeeChild ab=new EmployeeChild("Jincy",23,obj);
		EmployeeChild ab1=new EmployeeChild("Anu",75,obj1);
				ab.show();
				ab1.show();
			System.out.println(obj.state);

	}

}
