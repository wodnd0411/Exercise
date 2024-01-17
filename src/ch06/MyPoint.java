package ch06;

public class MyPoint {
	
	// 인스턴스 변수
	int x;
	int y;
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 인스턴스 변수 사용 -> 인스턴스 메서드 사용
	double getDistance(int x, int y) {
		double result = Math.sqrt((this.x - x) * (this.x - x) + (this.y - y)
				* (this.y - y));
		
		return result;
	}

}
