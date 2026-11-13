class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> uniqeNums = new HashSet<>();

        for (Integer num : nums){
            if(!uniqeNums.add(num) ){
                return true;
            }
        }
        return false;
    }
}