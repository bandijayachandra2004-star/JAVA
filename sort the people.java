import java.util.*;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Integer[] idx = new Integer[heights.length];

        for (int i = 0; i < heights.length; i++) {
            idx[i] = i;
        }

        Arrays.sort(idx, (a, b) -> heights[b] - heights[a]);

        String[] result = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            result[i] = names[idx[i]];
        }

        return result;
    }
}
