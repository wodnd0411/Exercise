package ch03;

import java.util.Scanner;

public class Exercise3_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		
		int result = 0;
		
		System.out.print("백의 자리 정수를 입력하시오 : ");
		input = scanner.nextInt();
		
		result = (input / 100) * 100; // 백의 자리만 뽑아서 계산
		
		System.out.println(result);
	}

}
