package patterns;

public class FloydTrangle {
	public static void pattern(int val) {
		int temp = 1;
		for(int i = 1; i <= val; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(temp + " ");
				temp++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		pattern(5);
	}

}
