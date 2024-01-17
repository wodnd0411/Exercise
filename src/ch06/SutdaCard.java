package ch06;

// Exercise6_1
public class SutdaCard {

	int num; // 카드 숫자(1 ~ 10)
	boolean isKwang; // 광이면 true, 아니면 false
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		String kwang = "";
		
		if(isKwang) {
			kwang = "K";
		}
		else {
			kwang = "";
		}
		
		return num + kwang;
	}
	
}
