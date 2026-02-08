class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;

        // Step 1: Move non-zero elements forward
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }

        // Step 2: Fill remaining positions with zero
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}
