package array;

public class SubArray {
	public static void printSubArray(int arr[]) {
		int ts = 0;
		int maxiSum = Integer.MIN_VALUE;
		int currentSum = 0;
		
		for(int i = 0; i <arr.length; i++) {
			int subArrayTotal = 0; 
			int start = i;
			for(int j = i; j < arr.length; j++) {
				int end = j;
				for(int k = start; k <= end; k++) {
					System.out.print(arr[k] + " ");
					subArrayTotal += arr[k];  
				}
				if(subArrayTotal > maxiSum) {
					maxiSum = subArrayTotal;
				}
				ts++; 
				System.out.println();
			}
			System.out.print("Total of sub array is :" +subArrayTotal);
			
			System.out.println();
		}
		
		System.out.println("Total sub-arrays are :"+ts);
		System.out.print("Maximum sum of subarray is :"+maxiSum);
	}
	public static void main(String[] args) {
		
		int arr[] = {1, -2, 6, -1, 3};
		
		printSubArray(arr);
	}

}
