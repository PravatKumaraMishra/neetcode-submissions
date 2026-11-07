class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] counts = new int[128]; // ASCII characters

        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i)]++;
            counts[t.charAt(i)]--;
        }

        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}