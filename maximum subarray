import java.io.*;
import java.util.*;

class Result {

    public static List<Integer> maxSubarray(List<Integer> arr) {
        // Maximum subarray sum - Kadane's Algorithm
        int current = arr.get(0);
        int maxSubarray = arr.get(0);

        // Maximum subsequence sum
        int maxSubsequence = 0;
        int largest = arr.get(0);
        boolean hasPositive = false;

        for (int i = 0; i < arr.size(); i++) {
            int x = arr.get(i);

            // Kadane's algorithm
            if (i > 0) {
                current = Math.max(x, current + x);
                maxSubarray = Math.max(maxSubarray, current);
            }

            // Subsequence
            if (x > 0) {
                maxSubsequence += x;
                hasPositive = true;
            }

            largest = Math.max(largest, x);
        }

        if (!hasPositive) {
            maxSubsequence = largest;
        }

        return Arrays.asList(maxSubarray, maxSubsequence);
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            String[] input = br.readLine().split(" ");
            List<Integer> arr = new ArrayList<>();

            for (String s : input) {
                arr.add(Integer.parseInt(s));
            }

            List<Integer> result = Result.maxSubarray(arr);

            System.out.println(result.get(0) + " " + result.get(1));
        }
    }
}
