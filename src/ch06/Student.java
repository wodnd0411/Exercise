package ch06;

// Exercise6_3
public class Student {

	String name; // 학생 이름
	int ban; // 반
	int no; // 번호
	int kor; // 국어 점수
	int eng; // 영어 점수
	int math; // 수학 점수
	
	Student() {
		this("", 0, 0, 0, 0, 0);
	}
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// 국어, 영어, 수학 점수를 전부 더해서 반환
	int getTotal() { return kor + eng + math; }
	
	// 평균 구하기
	// 소수점 둘째자리에서 반올림
	float getAverage() {
		float avg = (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
		
		return avg;
	}
	
	String info() {
		return name + ", " + ban + ", " + no + ", " + kor + ", " + eng
				 + ", " + math + ", " + getTotal() + ", " + getAverage();
	}
	
}
