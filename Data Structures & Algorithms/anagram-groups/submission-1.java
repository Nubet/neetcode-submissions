class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // <Sorted Words, Anagrams of this sorted word>
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            String sorted = sortString(word);
            map.putIfAbsent(sorted, new ArrayList<>());
            // Get the list for the sorted key and add the current word to it
            map.get(sorted).add(word);
        }
        // Each map value is a list of anagrams, so values() returns all groups as Collection<List<String>> which we convert to an ArrayList
        return new ArrayList<>(map.values());
    }
    private String sortString(String toBeSorted) {
        char[] ar = toBeSorted.toCharArray();
        Arrays.sort(ar);
        return String.valueOf(ar);
    }
}
