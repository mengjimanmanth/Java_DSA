package functions;
import java.util.*;
public class BinCofficent {

		public static int fact(int val) {
			int f_val = 1;
			
			for(int i = 1; i <= val; i++) {
				f_val *= i;
			}
			return f_val;
		}
		
		public static float BCoffi(int n, int r) {
			int n_fact = fact(n);
			int r_fact = fact(r);
			int nr_fact = fact(n-r);
			
			float BCofficient = n_fact/(r_fact*nr_fact);
			return BCofficient;
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		
		
		System.out.println("Binomial Coefficient is "+BCoffi(n, r));
		sc.close();
	}

}
