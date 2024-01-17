package ch05;

// 주어진 배열을 시계방향으로 90도 회전시켜서 출력
public class Exercise5_9 {

	public static void main(String[] args) {
		// 4x5 행렬
		char[][] star = {
				{'*', '*', ' ', ' ', ' '},
				{'*', '*', ' ', ' ', ' '},
				{'*', '*', '*', '*', '*'},
				{'*', '*', '*', '*', '*'}
		}; 
		
		// 5x4 행렬
		char[][] result = new char[star[0].length][star.length];
		
		// 배열 star에서 시계방향으로 90도 회전 한 값을 저장
		for(int i = 0; i < star.length; i++) {
			for(int j = 0; j < star[i].length; j++) {
				result[j][i] = star[star.length - 1 - i][j];
			}
		}
		
		// star 출력
		for(int i = 0; i < star.length; i++) {
			for(int j = 0; j < star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		// result 출력
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			
			System.out.println();
		}
	}

}
