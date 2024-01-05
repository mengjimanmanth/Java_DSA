package array;

public class PrefixSumArray {
	public static void prefixSum(int arr[]) {
		int prefix[] = new int[arr.length];
		int MaxSubArr = Integer.MIN_VALUE;
		prefix[0] = arr[0];
		
		for(int i = 1; i < prefix.length; i++) {
			prefix[i] = prefix[i-1] + arr[i]; 
		}
		
		for(int i = 0; i < arr.length; i++) {
			int start = i;
			for(int j = i; j < arr.length; j++) {
				int end = j;
				
				int curSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
				 
				if(curSum > MaxSubArr) {
					MaxSubArr = curSum;
				}
			}
		}
		System.out.println(MaxSubArr);
	}
	public static void main(String[] args) {
		int arr[] = {1, -1, 5, 4, 7};
		prefixSum(arr);
	}

}
