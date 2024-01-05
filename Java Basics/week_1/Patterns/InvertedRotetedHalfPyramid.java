package patterns;

public class InvertedRotetedHalfPyramid {
	
	public static void pattern(int val) {
		for(int i = 1; i <= val; i++) {
			for(int j = 1; j <= val - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		pattern(5);
	}

}
