package functions;
public class FunOverType {
	
	public static int sum(int val1, int val2) {
		return val1 + val2;
	}
	
	public static float sum(float val1, float val2) {
		return val1 + val2;
	}
	public static void main(String[] args) {
		
		System.out.println(sum(1,2));
		System.out.println(sum(1.1f, 2.2f));

	}

}
