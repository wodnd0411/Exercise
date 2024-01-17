package ch03;

public class Exercise3_10 {

	public static void main(String[] args) {
		char ch = 'A';
		
		// ch가 대문자일 경우에만 소문자로 변경
		char lowerCase = (ch >= 'A' && ch <= 'Z') ? ((char)(ch + 32)) : (ch);
		
		System.out.println(ch);
		System.out.println(lowerCase);
	}

}
