class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;

        while (l < r) {
            int curSum = numbers[l] + numbers[r];

            // The sum is too large, so try a smaller right value
            if (curSum > target) {
                r--;
                continue;
            }
            // The sum is too small, so try a larger left value
            if (curSum < target) {
                l++;
                continue;
            }
            return new int[] {l + 1, r + 1};
        }
        return new int[0];
    }
}
