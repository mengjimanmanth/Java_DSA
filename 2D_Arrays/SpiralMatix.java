package arrays_2D;

public class SpiralMatix {
	public static void Smatrix(int arr[][]) {
		int startingRow = 0;
		int startingCol = 0;
		int endingRow = arr.length - 1;
		int endingCol = arr[0].length - 1;

		while (startingRow <= endingRow && startingCol <= endingCol) {
			// top
			for (int j = startingCol; j <= endingCol; j++) {
				System.out.print(arr[startingRow][j] + " ");
			}

			// right
			for (int i = startingRow + 1; i <= endingRow; i++) {
				System.out.print(arr[i][endingCol] + " ");
			}

			// bottom
			for (int j = endingCol - 1; j >= startingCol; j--) {
				if(startingCol == endingCol) {
					break;
				}
				System.out.print(arr[endingRow][j] + " ");
			}

			// left
			for (int i = endingRow - 1; i >= startingCol + 1; i--) {
				if(startingRow == endingRow) {
					break;
				}
				System.out.print(arr[i][startingCol] + " ");
			}
			
			startingRow++;
			endingRow--;
			startingCol++;
			endingCol--;
			
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		Smatrix(arr);
	}

}
