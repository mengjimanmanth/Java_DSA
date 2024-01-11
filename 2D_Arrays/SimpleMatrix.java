package arrays_2D;

import java.util.Scanner;

public class SimpleMatrix {
	public static void SearchMinMax(int arr[][],int n, int m) {
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		
		for(int  i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				min = Math.min(min, arr[i][j]);
				max = Math.max(max, arr[i][j]);
			}
		}
		System.out.println(min+" "+max);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][3];
		
		int n = arr.length, m = arr[0].length;
		
		for(int  i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int  i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		SearchMinMax(arr,n,m);
	}

}
