package patterns;

public class Holloe_Rectangle {
	
	public static void rect(int tot_row, int tot_col) {
		for(int i = 1; i <= tot_row; i++) {
			for(int j = 1; j <= tot_col; j++) {
				if(i == 1 || i==tot_row || j == 1 || j == tot_col) {
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
		rect(5,10);

	}

}
