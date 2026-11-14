class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int i = 0;
        int j = n - 1;

        // The problem assumes case-insensitive comparison
        // Strings are immutable, so we must assign the returned string back to s
        s = s.toLowerCase();
        while (i < j) {
            char c = s.charAt(i);
            char d = s.charAt(j);

            // skip not Alphanumeric chars
            if (!isAlphanumeric(c)) {
                i++;
                continue;
            }
            if (!isAlphanumeric(d)) {
                j--;
                continue;
            }

            // Comapare alphanumeric chars
            if (c != d)
                return false;

            i++;
            j--;
        }
        return true;
    }
    private boolean isAlphanumeric(char a) {
        return Character.isLetter(a) || Character.isDigit(a);
    }
}
