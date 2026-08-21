import java.io.*;
import java.util.*;

public class Solution {

    public static int birthday(List<Integer> s, int d, int m) {

        int count = 0;
        int sum = 0;

        // If the required segment is longer than the array
        if (m > s.size()) {
            return 0;
        }

        // First window
        for (int i = 0; i < m; i++) {
            sum += s.get(i);
        }

        if (sum == d) {
            count++;
        }

        // Slide the window
        for (int i = m; i < s.size(); i++) {
            sum = sum - s.get(i - m) + s.get(i);

            if (sum == d) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st =
                new StringTokenizer(br.readLine());

        List<Integer> s = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            s.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());

        int d = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int result = birthday(s, d, m);

        System.out.println(result);
    }
}
