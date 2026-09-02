import java.util.*;

class Main {

    static int[] search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        // Step 1: Build LPS array
        int[] lps = new int[m];

        int len = 0;
        int i = 1;

        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                lps[i] = ++len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        // Step 2: Search pattern in text
        ArrayList<Integer> result = new ArrayList<>();

        i = 0; // text index
        int j = 0; // pattern index

        while (i < n) {

            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }

            // Pattern found
            if (j == m) {
                result.add(i - j);

                // Continue searching for overlapping matches
                j = lps[j - 1];
            }

            // Mismatch
            else if (i < n && text.charAt(i) != pattern.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        // Convert ArrayList<Integer> to int[]
        int[] ans = new int[result.size()];

        for (int k = 0; k < result.size(); k++) {
            ans[k] = result.get(k);
        }

        return ans;
    }

    public static void main(String[] args) {

        String text = "aabaacaadaabaaba";
        String pattern = "aaba";

        int[] ans = search(text, pattern);

        System.out.println(Arrays.toString(ans));
    }
}
