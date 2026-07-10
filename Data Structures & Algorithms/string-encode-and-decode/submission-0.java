class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String str : strs) {
            encoded.append(str.length()).append("#").append(str);
        }
        return encoded.toString();
    }

    public List<String> decode(String s) {
        List<String> decodedResult = new ArrayList<>();

        // 'i' points to the start of the length number (could be multiple digit)
        int i = 0;
        // We use a while loop since the increment step is dynamic and depends on the parsed string length
        while (i < s.length()) {
            int j = i;
            while (s.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(s.substring(i, j));
            i = j + 1;  // Move 'i' past the '#' to the start of the actual word
            decodedResult.add(s.substring(i, i + length));
            i += length; // Move 'i' to the start of the next encoded word
        }
        return decodedResult;
    }
}
