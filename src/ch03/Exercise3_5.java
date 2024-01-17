package ch03;

import java.util.Scanner;

public class Exercise3_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		
		int result = 0;
		
		System.out.print("정수를 입력하시오 : ");
		input = scanner.nextInt();
		
		result = input / 10; // 일의 자리 제외 나머지 저장
		
		System.out.println(result * 10 + 1);
	}

}
