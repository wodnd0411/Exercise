package ch03;

import java.util.Scanner;

public class Exercise3_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int fahrenheit = 0;
		float celcious = 0.0f;
		
		System.out.print("화씨 온도를 입력하시오 : ");
		fahrenheit = scanner.nextInt();
		
		// 형변환 필요
		celcious = (int)((5f / 9 * (fahrenheit - 32)) * 100 + 0.5) / 100f;
		
		System.out.println(celcious);
	}

}
