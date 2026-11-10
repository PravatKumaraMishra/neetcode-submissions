

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mapper = new HashMap<>();

        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sortedKey = new String(arr);

            if (!mapper.containsKey(sortedKey)) {
                mapper.put(sortedKey, new ArrayList<>());
            }

            mapper.get(sortedKey).add(str);
        }

        return new ArrayList<>(mapper.values());    
    }
}
