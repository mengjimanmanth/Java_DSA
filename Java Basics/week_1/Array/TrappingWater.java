package array;

public class TrappingWater {
	public static int trapFun(int height[]) {
		int trappedWater = 0;
		
		//left max boundry
		int n = height.length;
		int leftMaxBoundrry[] = new int[height.length];
		leftMaxBoundrry[0] = height[0];
		for(int i = 1; i < height.length; i++) {
			leftMaxBoundrry[i] = Math.max(leftMaxBoundrry[i-1], height[i]);
		}
		
		//right max boundry
		int rightMaxBoundry[] = new int[height.length];
		rightMaxBoundry[n-1] = height[n-1];
		for(int i = n-2; i >= 0; i--) {
			rightMaxBoundry[i] = Math.max(rightMaxBoundry[i+1], height[i]);
		}
		
		
		for(int i = 0; i < height.length; i++) {
			int waterLevel = Math.min(leftMaxBoundrry[i], rightMaxBoundry[i]);
			trappedWater += waterLevel - height[i];
		}
		return trappedWater;
		
	}
	public static void main(String[] args) {
//		int[] height = {4,2,0,6,3,2,5};
		int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		System.out.println(trapFun(height));
		
	}

}
