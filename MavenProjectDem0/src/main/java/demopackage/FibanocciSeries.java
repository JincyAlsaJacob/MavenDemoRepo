package demopackage;

public class FibanocciSeries {

	public static void main(String[] args) {
		int first=0;
		int second=1;
		System.out.print(first+" "+second);
for(int i=2;i<25;i++)
{
	int next=first+second;
	first=second;
	second=next;
	System.out.print(" "+next);
	
}
	}

}
