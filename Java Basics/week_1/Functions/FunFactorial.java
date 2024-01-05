package functions;
import java.util.*;
public class FunFactorial {
	
	public static int fact(int val) {
		int f_val = 1;
		
		for(int i = 1; i <= val; i++) {
			f_val *= i;
		}
		return f_val;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		
		System.out.println(fact(val));
	}

}
