package ch05;

import java.util.Scanner;

// 단어의 글자들을 섞어서 보여주고 어떤 단어인지 맞추기
public class Exercise5_13 {

	public static void main(String[] args) {
		String[] words = {"television", "computer", "mouse", "phone"};
		
		Scanner scanner = new Scanner(System.in);
		
		// 배열 words의 단어들을 섞기
		for(int i = 0; i < words.length; i++) {
			 // 배열 words의 각 요소를 char형으로 변경
			char[] question = words[i].toCharArray();
			
			for(int j = 0; j < question.length; j++) {
				int index = (int)(Math.random() * question.length);
				char tmp = question[j];
				question[j] = question[index];
				question[index] = tmp;
			}
			
			// new String(question)은 char였던 것을 String으로 변환
			System.out.printf("Q%d. %s의 정답을 입력하시오 : ", i + 1, new String(question));
			String input = scanner.nextLine();
			
			if(input.equals(words[i])) {
				System.out.println("정답입니다.");
			}
			else {
				System.out.println("오답입니다.");
			}
		}
	}

}
