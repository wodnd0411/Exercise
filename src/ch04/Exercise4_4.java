package ch04;

public class Exercise4_4 {

	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		
		do {
			num++;
			
			if(num % 2 == 0) {
				sum -= num;
			}
			else {
				sum += num;
			}
		} while (sum < 100);
		
		System.out.printf("%d까지 더하면 총합이 100이상이 된다(총합 : %d).%n", num, sum);
	}

}
