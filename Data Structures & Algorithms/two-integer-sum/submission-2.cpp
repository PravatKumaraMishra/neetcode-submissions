class Solution {
public:
    static std::vector<int> twoSum(const std::vector<int>& nums, int target) {
        // Map to store: key = number value, value = index
        std::unordered_map<int, int> numMap;

        for (int i = 0; i < nums.size(); ++i) {
            int complement = target - nums[i];

            // Check if the complement already exists in our map
            if (numMap.find(complement) != numMap.end()) {
                return {numMap[complement], i};
            }

            // Otherwise, store the current number and its index
            numMap[nums[i]] = i;
        }

        return {}; // Return empty vector if no solution is found
    }
};
