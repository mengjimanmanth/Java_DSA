package array;

public class PassingArrAsArgument {
	public static void MyArr(int arr[]) {
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] += 1;
			
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		int arr[] = {1,2,3};
		MyArr(arr);
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
