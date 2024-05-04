package encapsulation;

public class ItemPriceUserClass {

	public static void main(String[] args) {
		ItemPriceEncapsulatedClass obj=new ItemPriceEncapsulatedClass();
		obj.setItem("Apple");
		obj.setPrice(240);
		System.out.println(obj.getItem());
		System.out.println( obj.getPrice());

	}

}
