package array;

public class KadanceMaxSubArray {
	
	public static boolean isAllNegative(int[] arr) {
        for (int num : arr) {
            if (num >= 0) {
                return false; // Not all elements are negative.
            }
        }
        return true; // All elements are negative.
    }
	
	public static void KadFun(int arr[]) {
		int maxSum = Integer.MIN_VALUE;
		int curSum = 0;
		
		
		for(int i = 0; i < arr.length; i++) {
			
			curSum += arr[i];
			if(curSum < 0) {
				curSum = 0;
			}
		}
		maxSum = Math.max(maxSum, curSum);
		System.out.println(maxSum);
	}
	public static void main(String[] args) {
		int arr[] = {1, -2, 6, -1, 3};
		
		 boolean result = isAllNegative(arr);
		 
		 if(result == false) {
			 KadFun(arr);
		 }
		
		
	}

}
