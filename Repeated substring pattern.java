class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        // Try every possible substring length
        for (int len = 1; len <= n / 2; len++) {

            // String length must be divisible by substring length
            if (n % len != 0) {
                continue;
            }

            boolean valid = true;

            // Compare every character with the corresponding
            // character in the first substring
            for (int i = len; i < n; i++) {
                if (s.charAt(i) != s.charAt(i % len)) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                return true;
            }
        }

        return false;
    }
}
