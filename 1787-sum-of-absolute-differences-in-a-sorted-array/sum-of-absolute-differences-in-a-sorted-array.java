class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Step 1: Calculate total sum
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        int leftSum = 0;
        
        // Step 2: Compute result for each index
        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            
            // Absolute differences
            int leftDiff = nums[i] * i - leftSum;
            int rightDiff = rightSum - nums[i] * (n - i - 1);
            
            result[i] = leftDiff + rightDiff;
            
            leftSum += nums[i];
        }
        
        return result;
    }
}
