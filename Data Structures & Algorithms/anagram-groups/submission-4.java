class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mapper = new HashMap<>();

        for (String str : strs) {

            // Step 1: Count character frequencies
            int[] freq = new int[26];

            for (char c : str.toCharArray()) {
                freq[c - 'a']++;
            }

            // Step 2: Convert frequency array into a String key
            StringBuilder key = new StringBuilder();

            for (int count : freq) {
                key.append(count).append("#");
            }

            String sortedKey = key.toString();

            // Step 3: Group anagrams using the key
            mapper.putIfAbsent(sortedKey, new ArrayList<>());

            mapper.get(sortedKey).add(str);
        }

        // Step 4: Return grouped anagrams
        return new ArrayList<>(mapper.values());

    }
}
