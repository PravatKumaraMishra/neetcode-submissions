class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int[] results = new int[128];
        for (int i = 0; i < s.length(); i++) {
            results[s.charAt(i)]++;
            results[t.charAt(i)]--;
        }
        for (int result : results) {
            if (result != 0)
                return false;
        }
        return true;
    }
}