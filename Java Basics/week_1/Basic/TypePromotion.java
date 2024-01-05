package variableAndDataType;
import java.util.Scanner;
public class TypePromotion {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		//first rule
		byte b = sc.nextByte();
		short s = sc.nextShort();
		char c = 'a';
		int i = sc.nextInt();
		
		System.out.println(b+s+c+i);
		
		//Second rule
		int i1 = 10;
		float f = 10.10f;
		long l = 20;
		double d = 20.20;
		
		System.out.println(i1+f+l+d);
		
	}
}
