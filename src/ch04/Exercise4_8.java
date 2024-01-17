package ch04;

public class Exercise4_8 {

	public static void main(String[] args) {
		// 2x + 4y = 10의 해를 구하시오.
		int answer = 10;
		
		for(int i = 0; i<= 10; i++) {
			for(int j = 0; j <= 10; j++) {
				answer = 2 * i + 4 * j;
				
				if(answer == 10) {
					System.out.printf("x = %d, y = %d%n", i, j);
				}
			}
		}
	}

}
