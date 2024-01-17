package ch06;

import java.util.Arrays;

public class Exercise6_20 {
	
	public static void main(String[] args) {
		int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(Arrays.toString(result));
	}
	
	// 인덱스 0번부터 랜덤 인덱스랑 값 변경
//	static int[] shuffle(int[] arr) {
//		for(int i = 0; i < arr.length; i++) {
//			int index = (int)(Math.random() * 9); // 0 ~ 9
//			int tmp = 0;
//			
//			tmp = arr[i];
//			arr[i] = arr[index];
//			arr[index] = tmp;
//			
//		}
//		
//		return arr;
//	}
	
	// 랜덤 인덱스와 랜덤 인덱스의 값 변경
	static int[] shuffle(int[] arr) {
		// 매개 변수 유효성 검사
		if(arr == null || arr.length == 0) {
			System.out.println("배열을 다시 만드시오.");
			
			return arr;
		}
		
		for(int i = 0; i < arr.length; i++) {
			int index1 = (int)(Math.random() * arr.length);
			int index2 = (int)(Math.random() * arr.length);
			
			int tmp = 0;
			
			tmp = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = tmp;
		}
		
		return arr;
	}

}
