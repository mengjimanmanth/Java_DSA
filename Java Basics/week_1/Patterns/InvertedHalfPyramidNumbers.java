package patterns;

public class InvertedHalfPyramidNumbers {
	public static void pattern(int val) {
		for(int i = 1; i <= val; i++) {
			for(int j = 1; j <= val - i + 1; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		pattern(5);

	}

}
