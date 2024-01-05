package functions;
public class FunOverPara {
	
	public static int sum(int val1, int val2) {
		return val1+val2;
	}
	
	public static int sum(int val1, int val2, int val3) {
		return val1+val2+val3;
	}
	public static void main(String[] args) {
		System.out.println(sum(1,2));
		System.out.println(sum(1,2,3));

	}

}
