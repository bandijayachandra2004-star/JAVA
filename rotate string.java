class Solution {
    public boolean rotateString(String s, String goal) {

        // Different lengths cannot be rotations
        if (s.length() != goal.length()) {
            return false;
        }

        // A rotation of s will always be a substring of s + s
        String doubled = s + s;

        return doubled.contains(goal);
    }
}
