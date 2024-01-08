package BasicSortingAlgorithms;
import java.util.*;
public class CountingSort {
	public static void CountingSort(int arr[]) {
		int n = arr.length;
		int maxRange = Integer.MIN_VALUE;
		
		for(int i = 0; i < n; i++) {
			maxRange = Math.max(maxRange, arr[i]);
		}
		
		int Count[] = new int[maxRange+1];
		
		for(int i = 0; i < n; i++) {
			Count[arr[i]]++;
		}
		
		int j = 0;
		for(int i = 0; i < Count.length; i++) {
			while(Count[i] > 0) {
				arr[j] = i;
				j++;
				Count[i]--;
				
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,1,3,5,8,2,3};
		
		CountingSort(arr);
		
		for(int element: arr) {
			System.out.print(element + " ");
		}
	}

}
