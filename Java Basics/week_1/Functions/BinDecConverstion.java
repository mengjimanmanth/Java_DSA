package functions;
public class BinDecConverstion {
	public static void BinTODec(int val) {
		int realVal = val;
		int pow = 0;
		int dec = 0;
		
		while(val > 0) {
			int ld = val % 10;
			
			dec = dec + (ld * (int)Math.pow(2, pow));
			pow++;
			val = val / 10;
		}
		System.out.println("Decimal value of "+realVal+" Is "+dec);
	}
	
	public static void DecBin(int val) {
		int OrignalVal = val;
		int bin = 0;
		int pow = 0;
		
		while(val > 0) {
			int rem = val%2;
			val = val / 2;
			bin = bin + (rem * (int)Math.pow(10, pow));
			pow++;
		}
		System.out.println("Binary Number convertion of "+OrignalVal+" is "+bin);
	}
	public static void main(String[] args) {
		
		//BinTODec(1011);
		DecBin(11);
	}

}
