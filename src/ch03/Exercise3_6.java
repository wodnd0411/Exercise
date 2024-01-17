package ch03;

import java.util.Scanner;

public class Exercise3_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		
		int num = 0;
		int result = 0;
		
		System.out.print("정수를 입력하시오 : ");
		input = scanner.nextInt();
		
		num = ((input / 10) + 1) * 10;
		result = num - input;
		
		System.out.println(result);
	}

}
