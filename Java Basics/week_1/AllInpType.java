package variableAndDataType;
import java.util.*;
public class AllInpType {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String first_name = sc.next();
		sc.nextLine();
		String Full_name = sc.nextLine();
		short age = sc.nextShort();
		float salary = sc.nextFloat();
		
		System.out.println("Hello "+ first_name);
		System.out.println("Entered Full name is "+Full_name);
		System.out.println("entered age is "+age);
		System.out.println("Your salary is "+salary);
		
	}
}
