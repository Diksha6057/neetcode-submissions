class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
        vector<int> ans;
        vector<int> count(nums.size() + 1, 0);
        for (int i = 0; i < nums.size(); i++) {
            count[nums[i]]++;
            if (count[nums[i]] == 2) 
                ans.push_back(nums[i]);
        }
        return ans;
    }};
