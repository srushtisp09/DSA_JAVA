import java.util.Arrays;

public class Assignments {
    // public static boolean containsDuplicates(int arr[]) {
    // Arrays.sort(arr);
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == arr[i + 1]) {
    // return true;
    // }
    // }
    // return false;

    // }
    // public static int rotateArray(int arr[], int target) {
    // int left = 0, right = arr.length - 1;
    // while (left <= right) {
    // int mid = left + (right - left) / 2;
    // if (arr[mid] == target) {
    // return mid;
    // }
    // if (arr[left] <= arr[mid]) {
    // if (target >= arr[left] && target <= arr[mid]) {
    // right = mid - 1;
    // } else {
    // left = mid + 1;
    // }
    // } else {
    // if (target > arr[mid] && target <= arr[right]) {
    // left = mid + 1;
    // } else {
    // right = mid - 1;
    // }
    // }
    // }
    // return -1;

    // }
    public static int trappedWater(int height[]) {
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);

        }
        int trappedWater = 0;
        for (int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    // public static int buyAndSell(int prices[]) {
    // int buyPrice = Integer.MAX_VALUE;
    // int maxProfit = 0;
    // for (int i = 0; i < prices.length; i++) {
    // if (buyPrice < prices[i]) {
    // int profit = prices[i] - buyPrice;
    // maxProfit = Math.max(maxProfit, profit);
    // } else {
    // buyPrice = prices[i];
    // }

    // }
    // return maxProfit;
    // }

    public static void main(String args[]) {
        // int arr[] = { 1, 2, 3, 4, 5, 1 };
        // System.out.println(containsDuplicates(arr));
        // int prices[] = { 7, 1, 5, 3, 6, 4 };
        // System.out.println("The maximum profit is: " + buyAndSell(prices));

        // int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        // System.out.println(rotateArray(arr, 0));
        int height[] = { 4, 2, 0, 3, 2, 5 };
        System.out.println("The total trapped rainwater is: " + trappedWater(height));
    }
}
