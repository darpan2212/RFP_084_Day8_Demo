package polymorphism;

public class PolyMorphismDemo {

	public static void main(String[] args) {

		float a = 12.532456789074231456789f;
		float b = 16.532456789074231456789f;
		Addition addition = new Addition();
		System.out.println(addition.add(12, 15));
		System.out.println(addition.add(a, b));
	}

}
