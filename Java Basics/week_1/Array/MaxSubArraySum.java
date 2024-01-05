package array;

public class MaxSubArraySum {
	public static void MaxSubArr(int arr[]) {
		int SubArrSum = 0;
		int MaxSubArraySum = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			//MaxSubArraySum = 0;
			for(int j = i; j < arr.length; j++) {
				SubArrSum = 0;
				for(int k = i; k <= j; k++) {
					
					SubArrSum += arr[k];
					
				}
				System.out.println(SubArrSum);
				if(MaxSubArraySum < SubArrSum) {
					MaxSubArraySum = SubArrSum;
				}
			}
		}
		System.out.println("Max sum of sub-array = "+MaxSubArraySum);
	}
	public static void main(String[] args) {
		int arr[] = {1, -1, 5, 4, 7};                              
		
		MaxSubArr(arr);
		
	}

}
