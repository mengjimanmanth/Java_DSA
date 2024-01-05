package BasicSortingAlgorithms;

public class SelectionSort {
	public static void SelectFun(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
	public static void main(String[] args) {
		int arr[] = {5,8,2,1,3};
		
		SelectFun(arr);
		
		for(int element : arr) {
			System.out.print(element + " ");
		}
	}

}
