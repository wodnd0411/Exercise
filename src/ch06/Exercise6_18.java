package ch06;

public class Exercise6_18 {

	public static void main(String[] args) {
		
	}

}

class MemberCall {
	
	int iv = 10; // 인스턴스 변수
	static int cv = 20; // 클래스 변수
	
	int iv2 = cv; // 인스턴스 변수에 클래스 변수 저장 가능
//	static cv2 = iv; // 인스턴스 생성 전에 cv2가 먼저 로드될 수 있어서 에러
	
	static void staticMethod1() {
		System.out.println(cv); // cv는 클래스 변수
//		System.out.println(iv); // iv는 인스턴스 변수 -> 인스턴스 생성 시 사용 가능
	}
	
	void instanceMethod1() {
		System.out.println(cv); // 인스턴스 메서드에서 클래스 변수 사용 가능
		System.out.println(iv); // 인스턴스 변수
	}
	
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1(); // 클래스 메서드에서 인스턴스 메서드 사용 불가
	}
	
	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}
	
}