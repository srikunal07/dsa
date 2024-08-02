class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // Calculate the sum of the first 'k' elements
        double maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }
        
        // Initialize current sum as the maxSum
        double currentSum = maxSum;
        
        // Slide the window across the array
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }
        
        // Return the maximum average
        return maxSum / k;
    }
}
