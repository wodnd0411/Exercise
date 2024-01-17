package ch06;

import java.util.Arrays;

public class Exercise6_23 {

	public static void main(String[] args) {
		int[] data = {3, 2, 9, 4, 7};
		
		System.out.println(Arrays.toString(data));
		System.out.println("최댓값 : " + max(data));
		System.out.println("최댓값 : " + max(null));
		System.out.println("최댓값 : " + max(new int[] {})); // 길이가 0인 배열
	}
	
	static int max(int[] arr) {
		int maxNum = 0;
		
		// 매개 변수의 유효성 검사
		if(arr == null || arr.length == 0) {
			return -999999;
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > maxNum) {
				maxNum = arr[i];
			}
		}
		
		return maxNum;
	}

}
