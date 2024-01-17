package ch05;

// 배열 answer에 저장된 숫자의 개수를 세어서 개수만큼 별찍기
public class Exercise5_8 {

	public static void main(String[] args) {
		// 1 ***
		// 2 **
		// 3 **
		// 4 ****
		int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
		int[] count = new int[4]; // 숫자가 몇 번 나왔는지 카운트
		
		for(int i = 0; i < answer.length; i++) {
			count[answer[i] - 1]++;
		}
		
		for(int i = 0; i < count.length; i++) {
			System.out.print(i + 1 + "은 " + count[i] + "번");
			
			for(int j = 0; j < count[i]; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
