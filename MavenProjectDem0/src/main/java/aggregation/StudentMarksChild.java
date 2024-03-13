package aggregation;

public class StudentMarksChild {
	int mark1;
	int mark2;
	StudentDetailsParent refer;
	StudentMarksChild(int mark1,int mark2,StudentDetailsParent refer)
	{
		this.mark1=mark1;
		this.mark2=mark2;
		this.refer=refer;
	}
	public void display()

	{
		System.out.println("English"+"   "+mark1+"  "+"Maths"+"   "+mark2);
		System.out.println("Name"+" "+refer.name+"   "+"Roll No: "+refer.rollno);
	}
	public static void main(String[] args) {
		StudentDetailsParent obj=new StudentDetailsParent("Ammu",35);
		StudentMarksChild ad=new StudentMarksChild(45,48,obj);
		ad.display();

	}

}
