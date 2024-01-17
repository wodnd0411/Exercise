package ch06;

public class Exercise6_4 {

	public static void main(String[] args) {
		Student s = new Student("È«±æµ¿", 1, 1, 100, 60, 76);
		
		System.out.println("ÀÌ¸§ : " + s.name);
		System.out.println("ÃÑÁ¡ : " + s.getTotal());
		System.out.println("Æò±Õ : " + s.getAverage());
	}

}
