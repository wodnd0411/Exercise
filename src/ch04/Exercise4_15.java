package ch04;

import java.util.Scanner;

public class Exercise4_15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = "";
		char tmp1 = ' ';
		char tmp2 = ' ';
		boolean isPalindrome = true; // 회문수 true false
		
		System.out.print("문자열을 입력하시오 : ");
		input = scanner.nextLine();
		
		for(int i = 0; i < input.length(); i++) {
			tmp1 = input.charAt(i); // 첫번째 글자부터
			tmp2 = input.charAt(input.length() - 1 - i); // 마지막 글자부터
			
			if(tmp1 != tmp2) {
				isPalindrome = false;
			}
		}
		
		if(isPalindrome) {
			System.out.println(input + "은 회문수 입니다.");
		}
		else {
			System.out.println(input + "은 회문수가 아닙니다.");
		}
	}

}
