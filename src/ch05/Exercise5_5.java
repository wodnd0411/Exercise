package ch05;

// 1 ~ 9사이의 중복되지 않는 숫자로 3자리 숫자 만들기
public class Exercise5_5 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int index = (int)(Math.random() * arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			int tmp = arr[i];
			arr[i] = arr[index];
			arr[index] = tmp;
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.print(arr[i]);
		}
	}

}
