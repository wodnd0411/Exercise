package ch04;

import java.util.Scanner;

public class Exercise4_14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int user = 0; // 사용자의 값
		int com = (int)(Math.random() * 100) + 1; // 1 ~ 100 사이의 임의의 값
		int count = 0; // 몇 번만에 맞췄는지 카운트
		
		do {
			System.out.print("1과 100 사이의 값을 입력하시오 : ");
			user = scanner.nextInt();
			
			count++;
			
			if(user > com) {
				System.out.println("숫자를 낮추시오.");
			}
			else if(user < com) {
				System.out.println("숫자를 높이시오.");
			}
		} while (user != com);
		
		System.out.println("사용자 : " + user);
		System.out.println("컴퓨터 : " + com);
		System.out.println("시도 횟수 : " + count);
	}

}
