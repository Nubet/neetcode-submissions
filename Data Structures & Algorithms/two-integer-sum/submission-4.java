class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        // fill the map
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        // look for complement
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            boolean isComplementInMap = map.containsKey(complement);

            if (isComplementInMap) {
                boolean isNotTheSameElement = (map.get(complement) != i);
                if (isNotTheSameElement) {
                    int[] result = {i, map.get(complement)};
                    return result;
                }
            }
        }

        return nums;
    }
}