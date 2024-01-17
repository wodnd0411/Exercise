package ch05;

import java.util.Scanner;

// 거스름 돈 내기
// 거스름 돈이 제한이 없을 때
public class Exercise5_6 {

	public static void main(String[] args) {
		int[] coinUnit = {500, 100, 50, 10}; // 동전 종류
		int money = 0;
		int moneyCount = 0; // 동전 개수
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("얼마를 받았습니까? : ");
		money = scanner.nextInt();
		
		for(int i = 0; i < coinUnit.length; i++) {
			moneyCount = money / coinUnit[i];
			money %= coinUnit[i];
//			money -= coinUnit[i] * moneyCount;
			
			System.out.println(coinUnit[i] + ": " + moneyCount + "개");
		}
	}

}
