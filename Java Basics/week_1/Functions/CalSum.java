package functions;
import java.util.*;
public class CalSum {
	public static int calSum(int val1, int val2) {
		
		int sum = val1 + val2;
		
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int val1 = sc.nextInt();
		int val2 = sc.nextInt();
		System.out.println(calSum(val1, val2));
		sc.close();
	}

}
