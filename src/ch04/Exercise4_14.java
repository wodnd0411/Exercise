package ch04;

import java.util.Scanner;

public class Exercise4_14 {

	public static void main(String[] args) {
		int comNum = (int)(Math.random() * 100) + 1; // 1 ~ 100
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1과 100사이의 숫자를 입력하시오 : ");
		int input = scanner.nextInt();
		
		int count = 1; // 시도 횟수
		
		while(true) {
			if(input > comNum) {
				count++;
				
				System.out.print("더 작은 수를 입력하시오 : ");
				
				input = scanner.nextInt();
			}
			else if(input < comNum) {
				count++;
				
				System.out.print("더 큰 수를 입력하시오 : ");
				
				input = scanner.nextInt();
			}
			else {
				System.out.println("맞췄습니다.");
				System.out.println("시도 횟수는 " + count + "입니다.");
				break;
			}
		}
	}

}
