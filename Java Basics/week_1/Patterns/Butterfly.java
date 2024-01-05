package patterns;

public class Butterfly {
	public static void pattern(int val){
		for(int i = 1; i<= val; i++) {
			//star
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			//space
			for(int j = 1; j <= 2 * (val - i); j++) {
				System.out.print(" ");
			}
			//star
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//2nd half
		for(int i = val; i >=1; i--) {
			//star
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			//space
			for(int j = 1; j <= 2 * (val - i); j++) {
				System.out.print(" ");
			}
			//star
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		pattern(4);
	}

}
