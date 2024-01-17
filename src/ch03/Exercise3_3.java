package ch03;

import java.util.Scanner;

public class Exercise3_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		
		String result = "";
		
		System.out.print("숫자를 입력하시오 : ");
		input = scanner.nextInt();
		
		result = (input > 0) ? "양수" : ((input == 0) ? "0" : "음수");
		System.out.println(result);
	}

}
