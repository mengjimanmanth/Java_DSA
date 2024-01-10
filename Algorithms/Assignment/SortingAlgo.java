package BasicSortingAlgorithmsAssignment;

public class SortingAlgo {
	public static void BubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			boolean swaped = false;
			for (int j = 0; j < n - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swaped = true;
				}
			}
			if(!swaped) {
				break;
			}
		}
	}
	
	public static void SelectionSort(int arr[]) {
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			int minIndex = i;
			for(int j = i+1; j < n; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		
	}
	
	public static void InsertionSort(int arr[]) {
		int n = arr.length;
		for(int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i-1;
			
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}		
			arr[j+1] = key;
		}
	}
	
	public static void CountingSort(int arr[]) {
		int n = arr.length;
		int MaxRange = Integer.MIN_VALUE; 
		for(int i = 0; i < n; i++) {
			MaxRange = Math.max(MaxRange, arr[i]);
		}
		
		int FreqArray[] = new int[arr.length+1];
		
		for(int i = 0; i < arr.length; i++) {
			FreqArray[arr[i]]++;
		}
		
		int j = 0;
		for(int i = 0; i < n; i++) {
			while(FreqArray[i] > 0) {
				arr[j] = i;
				j++;
				FreqArray[i]--;
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };

		//BubbleSort(arr);
		//SelectionSort(arr);
		//InsertionSort(arr);
		CountingSort(arr);
		
		for(int element : arr) {
			System.out.print(element+" ");
		}
	}

}





