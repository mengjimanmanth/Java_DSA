package array;

public class BinarySearch {
	public static int Binsearch(int arr[], int key) {
		int start = 0; 
		int end = arr.length - 1;
		
		
		while(start <= end) {
			
			int mid = (start + end) / 2;
			
			if(arr[mid] == key) {
				return mid;
			}
			else {
				if(arr[mid] < key) {
					start = mid +1;
				}
				else {
					end = mid - 1;
				}
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 20, 40, 60, 70};
		System.out.println("Index of Key is " +Binsearch(arr, 20));
		
	}

}
