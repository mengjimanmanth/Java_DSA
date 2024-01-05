package patterns;

public class DiamondPttrn {
	public static void pattern(int val) {
		for(int i = 1; i <= val; i++) {
			for(int j = 1; j <= val - i; j++) {
				System.out.print(" ");
			}
			
			for(int j = 1 ; j <= (2*i)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = val; i >= 1; i--) {
			for(int j = 1; j <= val - i; j++) {
				System.out.print(" ");
			}
			
			for(int j = 1 ; j <= (2*i)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		pattern(4);
	}

}
