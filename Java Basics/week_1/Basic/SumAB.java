package variableAndDataType;
import java.util.Scanner;
public class SumAB {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int A,B;
		A = sc.nextInt();
		B = sc.nextInt();
		
		int Sum = A + B;
		System.out.println(Sum);
	}
}
