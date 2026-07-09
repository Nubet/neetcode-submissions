class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // <Sorted word, its anagrams as list>

        Map<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            String sortedWord = sortStr(word);
            map.putIfAbsent(sortedWord, new ArrayList<>());

            List<String> anagramList = map.get(sortedWord);
            anagramList.add(word);
        }
        return new ArrayList<>(map.values());
    }
    private String sortStr(String word) {
        char[] extractedChars = word.toCharArray();
        Arrays.sort(extractedChars);
        return new String(extractedChars);
    }
}
