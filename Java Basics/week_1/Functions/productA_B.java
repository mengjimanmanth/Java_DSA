package functions;
import java.util.*;
public class productA_B {
	
	public static int prod(int val1, int val2) {
		int product = val1 * val2;
		return product;
	}

		
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			 
			int val1 = sc.nextInt();
			int val2 = sc.nextInt();
			
			System.out.println(prod(val1, val2));
			
			int pd = prod(10,20);
			System.out.println(pd);
		}



}
