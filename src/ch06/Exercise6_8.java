package ch06;

// 다음의 코드에 정의된 변수들을 종류별로 구분해라
public class Exercise6_8 {

	public static void main(String[] args) {
		PlayingCard card = new PlayingCard(1, 1);
	}

}

class PlayingCard {
	
	int kind;
	int num;
	
	static int width;
	static int height;
	
	PlayingCard() {
		this(0, 0);
	}
	
	PlayingCard(int k, int n) {
		kind = k;
		num = n;
	}
	
}

// 클래스 변수 : width, height
// 인스턴스 변수 : kind, num
// 지역 변수 : k, n, args, card