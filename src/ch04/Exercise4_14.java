package ch04;

import java.util.Scanner;

public class Exercise4_14 {

	public static void main(String[] args) {
		int comNum = (int)(Math.random() * 100) + 1; // 1 ~ 100
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1�� 100������ ���ڸ� �Է��Ͻÿ� : ");
		int input = scanner.nextInt();
		
		int count = 1; // �õ� Ƚ��
		
		while(true) {
			if(input > comNum) {
				count++;
				
				System.out.print("�� ���� ���� �Է��Ͻÿ� : ");
				
				input = scanner.nextInt();
			}
			else if(input < comNum) {
				count++;
				
				System.out.print("�� ū ���� �Է��Ͻÿ� : ");
				
				input = scanner.nextInt();
			}
			else {
				System.out.println("������ϴ�.");
				System.out.println("�õ� Ƚ���� " + count + "�Դϴ�.");
				break;
			}
		}
	}

}
