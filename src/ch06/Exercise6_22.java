package ch06;

public class Exercise6_22 {

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "은 숫자입니까? " + isNumber(str));
		
		str = "12o34";
		System.out.println(str + "은 숫자입니까? " + isNumber(str));
	}
	
	static boolean isNumber(String str) {
		// 매개 변수의 유효성 검사
		if(str == null || str.equals("")) {
			return false;
		}
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); // 한 문자씩 저장
			
			if(ch < '0' || ch > '9') {
				return false;
			}
		}
		
		return true;
	}

}
