package functions;

public class PanilFun {
	public static void CheckPalin(int num) {
		int temp = num;
		int reversed = 0;
		while(temp > 0) {
			reversed = reversed * 10 + temp % 10;
			temp = temp / 10;
		}
		if(reversed == num) {
			System.out.println("ita palindrome");
		}
		System.out.println(reversed+ " " +temp);
	}
	public static void main(String[] args) {
		CheckPalin(12321);

	}

}
