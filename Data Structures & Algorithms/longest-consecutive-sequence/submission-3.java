class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : nums) {
            // A longest sequence starts only if the previous number is missing
            if (!set.contains(num - 1)) {
                int length = 1;

                // Count consecutive numbers by checking if the next expected number is in the set
                while (set.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
