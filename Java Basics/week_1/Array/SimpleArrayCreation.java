package array;
import java.util.*;

public class SimpleArrayCreation {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int marks[] = new int[50];
		
		marks[0] = sc.nextInt();
		marks[1] = sc.nextInt();
		marks[2] = sc.nextInt();
		
		int Total_marks = marks[0] + marks[1] +marks[2];
		int Total_AVG = (marks[0] + marks[1] +marks[2]) / 3;
		System.out.println("Total marks: "+Total_marks+ "Average of marks: "+Total_AVG);
		sc.close();
	}

}
