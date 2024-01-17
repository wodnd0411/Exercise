package ch05;

import java.util.Scanner;

// 문자열을 입력받고 문자와 숫자를 암호화해서 출력
public class Exercise5_10 {

	public static void main(String[] args) {
		// 알파벳 암호표
		// a b c d ''' x y z
		char[] abcCode = {'`', '~', '!', '@', '#', '$', '%', '^', '&', '*', 
				'(', ')', '-', '_', '+', '=', '|', '[', ']', '{', '}', ';',
				':', ',', '.', '/'
		};
		
		// 숫자 암호표
		// 0 ~ 9
		char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
		
		// 암호화 결과
		String result = "";
		
		// 암호화를 위한 알파벳과 숫자를 입력
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("암호화할 문자열을 입력하시오 : ");
		String str = scanner.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			// 입력값을 한 글자씩 저장 
			char ch = str.charAt(i);
			
			// ch가 소문자일 때
			if(ch >= 'a' && ch <= 'z') {
				ch = abcCode[ch - 'a'];
				result += ch;
			}
			// ch가 대문자일 때
			else if(ch >= 'A' && ch <= 'Z') {
				ch = abcCode[ch - 'A'];
				result += ch;
			}
			// ch가 숫자일 때
			else if(ch >= '0' && ch <= '9') {
				ch = numCode[ch - '0'];
				result += ch;
			}
		}
		
		System.out.println("입력한 문자열 : " + str);
		System.out.println("암호화 된 문자열 : " + result);
	}

}
