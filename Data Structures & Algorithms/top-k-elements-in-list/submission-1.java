class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> sorted = new ArrayList<>(map.keySet());
        sorted.sort((a, b) -> Integer.compare(map.get(b), map.get(a)));

        int[] result = new int[k];

        for (int i=0; i < k; i++){
            result[i] = sorted.get(i);
        }
        return result;
    }
}
