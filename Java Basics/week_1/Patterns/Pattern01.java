package patterns;

public class Pattern01 {
	public static void pattern(int val) {
		for(int i = 1; i <= val; i++) {
			for(int j = 1; j <= i; j++) {
				if((i+j)%2 == 0) {
					System.out.print(1+" ");
				}
				else{
						System.out.print(0+" ");
					}
				}
			System.out.println();
			}
		}
	public static void main(String[] args) {
		pattern(5);

	}

}
