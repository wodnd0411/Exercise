package ch03;

import java.util.Scanner;

public class Exercise3_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int itemNum = 0; //물건 수
		int box = 0; // 바구니 수
		
		System.out.print("물건 갯수를 입력하시오(1박스에 10개씩). : ");
		itemNum = scanner.nextInt();
		
		while(itemNum < 0) {
			System.out.print("개수를 알맞게 입력하시오.(only 양수)");
			itemNum = scanner.nextInt();
		}
		
		// itemNum > 0
//		if(itemNum % 10 == 0) {
//			box = itemNum / 10;
//			System.out.println("박스의 갯수 : " + box);
//		}
//		else {
//			box = (itemNum / 10) + 1;
//			System.out.println("박스의 갯수 : " + box);
//		}
		box = (itemNum / 10) + ((itemNum % 10 > 0) ? 1 : 0);
		System.out.println("박스의 갯수 : " + box);
	}

}
