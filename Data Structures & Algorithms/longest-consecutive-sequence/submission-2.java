class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            numSet.add(num);
        }

        int n = nums.length;
        int maxSequence = 0;

        for (int i = 0; i < n; i++) {
            if (!numSet.contains(nums[i] - 1)) {
                int length = 1;
                while (numSet.contains(nums[i] + length)) {
                    length++;
                }
                maxSequence = Math.max(maxSequence, length);
            }
        }
        return maxSequence;
    }
}
