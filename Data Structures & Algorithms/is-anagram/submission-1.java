class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] letters = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            char sLetter = s.charAt(i);
            char tLetter = t.charAt(i);

            int sIndex = sLetter - 'a';
            int tIndex = tLetter - 'a';

            letters[sIndex]++;
            letters[tIndex]--;
        }

        for (int count : letters) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
