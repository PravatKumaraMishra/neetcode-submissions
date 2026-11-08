impl Solution {
    pub fn two_sum(nums: Vec<i32>, target: i32) -> Vec<i32> {
        // Map to store: key = number value, value = index
        let mut num_map = HashMap::new();

        for (i, &num) in nums.iter().enumerate() {
            let complement = target - num;

            // Check if the complement already exists in our map
            if let Some(&index) = num_map.get(&complement) {
                return vec![index as i32, i as i32];
            }

            // Otherwise, store the current number and its index
            num_map.insert(num, i);
        }

        vec![] // Return empty vector if no solution is found
    }
}
