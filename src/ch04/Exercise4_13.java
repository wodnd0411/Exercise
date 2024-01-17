package ch04;

import java.util.Scanner;

public class Exercise4_13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = "";
		char ch = ' ';
		boolean isNumber = true;
		
		System.out.print("문자열을 입력하시오 : ");
		input = scanner.nextLine(); // 숫자인지 판별하기 위한 문자열 입력
		
		for(int i = 0; i < input.length(); i++) {
			ch = input.charAt(i); // 한 글자씩 ch에 담는다
			
			// ch가 숫자인지 판별
			if((ch - '0') >= 0 && (ch - '0') < 10) {
				isNumber = true;
			}
			else {
				isNumber = false;
				
				break;
			}
		}
		
		if(isNumber) {
			System.out.println("숫자입니다.");
		}
		else {
			System.out.println("숫자가 아닙니다.");
		}
	}

}
