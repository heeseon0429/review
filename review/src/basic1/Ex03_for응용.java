package basic1;

public class Ex03_for응용 {

	public static void main(String[] args) {
		/*
		//문제[1]
		for(int i=0; i <26; i++) {
			
			for(char a = 'A'; a <= 'A'+i; a++) {
				System.out.print(a);
			}
			System.out.println();
		}
		
		//문제[2]
		for(int i=0; i <26; i++) {
			
			for(char a = 'A'; a <= 'Z'-i; a++) {
				System.out.print(a);
			}
			System.out.println();
		}
		
		//문제[3]★
		for(int i=0; i <26; i++) {
			
			for(char a = (char)('A'+i); a <= 'Z'; a++) {
				System.out.print(a);
			}
			System.out.println();
		}
		
		//문제[4]
		for(int i=0; i <26; i++) {
			
			for(char a = 'Z'; a >= 'Z'-i; a--) {
				System.out.print(a);
			}
			System.out.println();
		}
		*/
		//문제[5]★
		for(int i=0; i <26; i++) {
		for(int j=0; j <i; j++) {
			System.out.print(" ");
		}
			for(char a = (char)('A'+i); a <= 'Z'; a++) {
				System.out.print(a);
			}
			System.out.println();
		}
		
		
		
	}

}
