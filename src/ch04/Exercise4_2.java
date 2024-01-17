package ch04;

public class Exercise4_2 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 20; i++) {
			// 2의 배수와 3의 배수가 아닌 수
			if(i % 2 != 0 && i % 3 != 0) {
				sum += i;
			}
		}
		
		System.out.printf("1부터 20까지 2 또는 3의 배수가 아닌 수의 총합 : %d%n", sum);
	}

}
