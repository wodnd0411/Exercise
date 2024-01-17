package ch05;

// 2차원 배열에 행과 열을 하나 더 추가하여 총합을 추가하여 출력
public class Exercise5_11 {

	public static void main(String[] args) {
		// 5x3 행렬
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}
			};
		
		// 행과 열을 하나 추가해서 보여질 결과
		int[][] result = new int[score.length + 1][score[0].length + 1];
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				result[i][j] = score[i][j];
				result[i][score[i].length] += score[i][j]; // 행의 총합
				result[score.length][j] += score[i][j]; // 열의 총합
				
				// 배열 result의 마지막 행 or 열의 총합 
				result[score.length][score[0].length] += score[i][j];
			}
		}
		
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				System.out.printf("%4d", result[i][j]);
			}
			
			System.out.println();
		}
	}

}
