class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n <= 0) {
            return 0;
        }

        int maxSequence = 1;
        int currentSequence = 1;

        Arrays.sort(nums);

        for (int i = 0; i < n - 1; i++) {
            if (nums[i + 1] == nums[i] + 1) {
                currentSequence++;
                if (currentSequence > maxSequence) {
                    maxSequence = currentSequence;
                }
            } else if (nums[i + 1] != nums[i]) {
                currentSequence = 1;
            }
        }
        return maxSequence;
    }
}
