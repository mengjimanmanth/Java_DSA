package functions;

public class OptPrimNo {
	
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
	public static void main(String[] args) {
		
		System.out.println(Isprime(16));

	}

}
