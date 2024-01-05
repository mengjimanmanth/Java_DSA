package variableAndDataType;
import java.util.Scanner;
public class AreaOfCircle {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		float R = sc.nextInt();
		float pi = 3.14f;
		
		float area = pi * R * R;
		
		System.out.println(area);
		
	}
}
