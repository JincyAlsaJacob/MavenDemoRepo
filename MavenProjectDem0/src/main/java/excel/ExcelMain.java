package excel;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		System.out.println(ExcelRead.getStringData(0,0));
		System.out.println(ExcelRead.getStringData(1,0));
		System.out.println(ExcelRead.getIntegerData(0,1));
	}

}
