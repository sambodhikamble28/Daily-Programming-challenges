import java.util.*;

public class TrappingRainWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of bars: ");
        int n = sc.nextInt();

        int height[] = new int[n];
        System.out.println("Enter heights of bars:");
        for(int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        int result = trap(height);
        System.out.println("Total trapped water: " + result);
    }
    public static int trap(int[] height) {
        int n = height.length;
        if(n == 0) return 0;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }
        int trapped = 0;
        for(int i = 0; i < n; i++) {
            trapped += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return trapped;
    }
}
