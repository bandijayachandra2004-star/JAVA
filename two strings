import java.util.*;

class Result {

    public static String twoStrings(String s1, String s2) {

        boolean[] present = new boolean[26];

        // Store characters of s1
        for (char c : s1.toCharArray()) {
            present[c - 'a'] = true;
        }

        // Check characters of s2
        for (char c : s2.toCharArray()) {
            if (present[c - 'a']) {
                return "YES";
            }
        }

        return "NO";
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();

            System.out.println(Result.twoStrings(s1, s2));
        }

        sc.close();
    }
}
