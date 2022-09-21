package basic3;

public class Ex09_Factorial {

	public static void main(String[] args) {

		int fact = factorial(5);
		System.out.println("!=" + fact);
		
	}
	static int factorial(int i) {
		//fact = 5*4*3*2*1
		if(i==1) return 1;
		return i*factorial(i-1);
	}
}

/*
 * factorial
 * 5! = 5*4*3*2*1 
 */
