package patterns;

public class RhombusPttm {
	
//	public static void pattern(int val){
//		for(int i = 1; i <= val; i++) {
//			for(int j = val; j >= i; j--) {
//				System.out.print(" ");
//			}
//			for(int j = 1; j <= i-1; j++) {
//				System.out.print("*");
//			}
//			for(int j = val; j >= i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		
//	}
	
	public static void pattern(int val) {
		for(int i = 1; i <= val; i++) {
			for(int j = 1; j <= val-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=val; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		pattern(9);
	}

}
