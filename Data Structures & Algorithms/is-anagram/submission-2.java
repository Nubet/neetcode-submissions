class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> counts = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // if character exist in map - return its count value, if not return default value (0) then increment
            counts.put(sChar, counts.getOrDefault(sChar, 0) + 1);
            counts.put(tChar, counts.getOrDefault(tChar, 0) - 1);
        }

        for (int count : counts.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
