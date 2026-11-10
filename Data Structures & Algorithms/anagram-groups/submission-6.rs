impl Solution {
    pub fn group_anagrams(strs: Vec<String>) -> Vec<Vec<String>> {
        let mut mapper: HashMap<[usize; 26], Vec<String>> = HashMap::new();

        for s in strs {
            // Step 1: Count character frequencies
            let mut freq = [0usize; 26];

            for c in s.bytes() {
                freq[(c - b'a') as usize] += 1;
            }

            // Step 2: Group using frequency array as key
            mapper.entry(freq).or_default().push(s);
        }

        mapper.into_values().collect()
    }
}
