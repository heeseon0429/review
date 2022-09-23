package Test2;

import java.util.Calendar;

public class Calendar1 {

	public static void main(String[] args) {
		int year = 1998;

		Calendar c = Calendar.getInstance();
		int age = c.get(Calendar.YEAR) - year + 1;

		System.out.println("태어난 년도 : " + year);
		System.out.println("나이 : " + age);

	}

}
