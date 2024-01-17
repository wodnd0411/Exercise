package ch04;

public class Exercise4_6 {

	public static void main(String[] args) {
		int sum = 0;
		
		System.out.println("두 주사위의 눈의 합이 6");
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				sum = i + j;
				
				if(sum == 6) {
					System.out.printf("[%d, %d]%n", i, j);
				}
			}
		}
	}

}
