package ch04;

public class Exercise4_12 {

	public static void main(String[] args) {
		for(int i = 2; i <= 9; i += 3) {
			for(int j = 1; j <= 3; j++) {
				for(int k = i; k <= i + 2; k++) {
					if(k > 9) {
						break;
					}
					
					System.out.print(k + " x " + j + " = " + k * j + "\t");
				}
				
				System.out.println();
			}
			
			System.out.println();
		}
	}
}
