class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // <num, its frequency>
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // sort numbvers by frequency descading, reversed() because the default order is ascending
        List<Integer> uniqeElements = new ArrayList<>(freq.keySet());
        uniqeElements.sort(Comparator.comparingInt(freq::get).reversed());

        // Take first k elements
        int result[] = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = uniqeElements.get(i);
        }
        return result;
    }
}
