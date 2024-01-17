package ch05;

// 커맨드라인으로부터 금액을 입력받는다
// 보유한 동전의 개수로 거스름 돈을 낸다
// 거슬러 줄 돈이 부족하면 "거스름 돈이 부족합니다" 출력
public class Exercise5_7 {
	
	public static void main(String[] args) {
		// 커맨드라인이 0일 때
		if(args.length != 1) {
			System.out.println("USAGE : java Exercise5_7 3120");
			System.exit(0); // 프로그램 종료
		}
		
		// 입력한 문자열을 숫자로 변환
		int money = Integer.parseInt(args[0]);
		
		System.out.println("money = " + money);
		
		int[] coinUnit = {500, 100, 50, 10}; // 동전 단위
		int[] coin = {5, 5, 5, 5}; // 단위별 남은 동전 개수
		
		for(int i = 0; i < coinUnit.length; i++) {
			int coinNum = 0; // 동전의 개수, 개수가 넘어가면 밑의 단위로 이전
			coinNum = money / coinUnit[i];
			
			// 충분한 동전이 있을 때
			if(coin[i] >= coinNum) {
				coin[i] -= coinNum;
			}
			// 충분한 동전이 없으면 배열 coin에 있는 만큼만 뺀다
			else {
				coinNum = coin[i];
				coin[i] = 0;
			}
			
			// money - (동전 단위 * 동전 개수)
			money = money - (coinUnit[i] * coinNum);
			
			System.out.println(coinUnit[i] + "원 : " + coinNum + "개");
		}
		
		// 거스름 돈이 부족해 잔돈이 남은 경우
		if(money > 0) {
			System.out.println("거스름 돈이 부족합니다.");
			System.exit(0); // 프로그램 종료
		}
		
		System.out.println("=남은 동전의 개수=");
		for(int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원 : " + coin[i] + "개");
		}
	}

}
