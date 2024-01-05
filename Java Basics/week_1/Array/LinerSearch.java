package array;

public class LinerSearch {
	public static int ElementSearch(int arr[], int key) {
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String args[]) {
		int arr[] = {1, 2, 3, 4, 10, 50};
		int key = 50;
		int index = ElementSearch(arr, key);
		
		if(index == -1) {
			System.out.println("Key NOT FOUND");
		}else {
			System.out.println("Key Found at Index: "+index);
		}
	}
}
