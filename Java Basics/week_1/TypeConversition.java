package variableAndDataType;
import java.util.Scanner;
public class TypeConversition {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		double d = sc.nextInt();
		
		System.out.println("This is Implicit Type conversition :");
		System.out.println("Integer is converted into Double "+d);
		
		int i = (int)sc.nextFloat();
		System.out.println("This is explict type conversition: ");
		System.out.println("Float converted into integer "+i);
		
	}
}
