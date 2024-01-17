package ch06;

// 두 점 사이의 거리 계산(static 메서드)
public class Exercise6_6 {

	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));
	}
	
	// 인스턴스 변수 사용 X -> static 메서드 사용
	static double getDistance(int x1, int y1, int x2, int y2) {
		double result = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		
		return result;
	}

}
