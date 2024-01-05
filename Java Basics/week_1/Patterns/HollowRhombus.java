package patterns;

public class HollowRhombus {
	public static void pattern(int val) {
		for(int i = 1; i <= val; i++) {
			for(int j = val; j >= i; j--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= val; j++ ) {
				if( j == 1 || j == val || i == 1 || i == val) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(5);
	}

}
