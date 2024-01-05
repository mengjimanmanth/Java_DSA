package array;

public class ReverseAnArray {
	 
	public static void reverseArray(int arr[]) {
		int first = 0, last = arr.length-1;
		
		while(first < last) {
			int temp = arr[first];
			arr[first] = arr[last];
			arr[last] = temp;
			first++;
			last--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,5,7,2,55};
		reverseArray(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
