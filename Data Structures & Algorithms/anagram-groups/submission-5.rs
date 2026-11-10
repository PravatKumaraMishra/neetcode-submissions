impl Solution {
    pub fn group_anagrams(strs: Vec<String>) -> Vec<Vec<String>> {
        let mut mapper: HashMap<String, Vec<String>> = HashMap::new();

        for s in strs {
            // Step 1: Convert string into characters
            let mut chars: Vec<char> = s.chars().collect();

            // Step 2: Sort characters
            chars.sort_unstable();

            // Step 3: Create common key
            let key: String = chars.into_iter().collect();

            // Step 4: Group anagrams
            mapper.entry(key).or_default().push(s);
        }

        mapper.into_values().collect()
    }
}
