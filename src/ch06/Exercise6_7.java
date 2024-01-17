package ch06;

//두 점 사이의 거리 계산(인스턴스 메서드)
public class Exercise6_7 {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);
		
		// 좌표 p와 (2, 2)의 사이의 거리
		System.out.println(p.getDistance(2, 2));
	}

}
