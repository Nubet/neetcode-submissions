class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] resultArray = new int[n];

        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    product *= nums[j];
                }
            }
            resultArray[i] = product;
        }
        return resultArray;
    }
}
