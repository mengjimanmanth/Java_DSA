package array;

public class LargestNumber {
	public static int largestNumber(int arr[]) {
		int largest = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		return largest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 15, 1, 6, 8, 4};
		System.out.println(largestNumber(arr));
		
	}

}
