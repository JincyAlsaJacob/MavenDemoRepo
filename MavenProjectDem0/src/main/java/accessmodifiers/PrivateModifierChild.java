package accessmodifiers;

public class PrivateModifierChild {

	public static void main(String[] args) {
		
		PrivateModifiersParent obj=new PrivateModifiersParent();
		obj.show();
		System.out.println(obj.a);
	}

}
