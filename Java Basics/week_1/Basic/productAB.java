package variableAndDataType;
import java.util.Scanner;
public class productAB {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		A = sc.nextInt();
		B = sc.nextInt();
		
		System.out.println("Product of A and B is: "+A*B);
	}
}
