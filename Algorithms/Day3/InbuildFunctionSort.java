package BasicSortingAlgorithms;
import java.util.*;
public class InbuildFunctionsSorting {

	public static void main(String[] args) {
		Integer arr[] = {5,4,1,3,2};
    
    Arrays.sort(arr);    //sorting an array
    Arrays.sort(arr,0,3));  //sorting an specific range of an array
    Arrays.sort(arr, Collections.reverseOrder());      // reverse an array in soeted manar 
		Arrays.sort(arr,0,3, Collections.reverseOrder());  // sorting specific range 
		
		for(int element : arr) {
			System.out.print(element + " ");
		}
	}
}
