class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();

        for (Integer num : nums) {
            if (hashSet.contains(num)) {
                return true;
            }
            hashSet.add(num);
        }
        return false;
    }
}