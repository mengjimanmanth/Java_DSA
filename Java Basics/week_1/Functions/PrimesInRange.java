package functions;

public class PrimesInRange {
	public static boolean Isprime(int val) {
		if (val == 2) {
			return true;
		}
		for(int i = 2; i <= Math.sqrt(val); i++)
		{
			if(val % i == 0) {
				return false;
			}
		}
		
		return true;
	} 
	
	public static void primeInrange(int n) {
		for(int i = 2; i <= n; i++) {
			if(Isprime(i)) {
				System.out.print(i+ " ");
			}
		}
	}
	public static void main(String[] args) {
		
		primeInrange(10);
	}

}
