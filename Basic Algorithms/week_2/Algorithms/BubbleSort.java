package BasicSortingAlgorithms;

public class BubbleSort {
	public static void BubbleFun(int arr[]) {
		
		for(int i = 0; i < arr.length; i++) {
			boolean swaped = false;
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			if(!swaped) {
				break;
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,5,3,8,6};
		
		BubbleFun(arr);
		
		for(int element: arr) {
			System.out.print(element + " ");
		}

	}

}
