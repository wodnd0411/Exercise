package ch05;

import java.util.Scanner;

// 예제 MultilArrEx4 변경
public class Exercise5_12 {

	public static void main(String[] args) {
		// 3x2 행렬
		String[][] words = {
				{"chair", "의자"},
				{"computer", "컴퓨터"},
				{"integer", "정수"}
		};
		
		int count = 0; // 문제 맞추면 카운트
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < words.length; i++) {
			System.out.print("Q" + (i + 1) + ". " + words[i][0] + "의 뜻은? : ");
			String input = scanner.nextLine();
			
			if(input.equals(words[i][1])) {
				System.out.println("정답입니다.");
				
				count++;
			}
			else {
				System.out.println("틀렸습니다.");
				System.out.println("정답은 " + words[i][1] + "입니다.");
			}
		}
		
		System.out.println();
		System.out.println("전체 " + words.length + "문제 중 " + count + "문제 맞췄습니다.");
	}

}
