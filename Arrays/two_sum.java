// Problem : Given an array of integers nums and an integer target. Return the indices(0 - indexed) of two elements in nums such that they add up to target.
// Platform : takeuforward
// Difficulty : Medium 
// TC : O(N)
// SC : O(N)


class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length;i++) {
            int num = nums[i];
            int more_needed = target - num;

            if(map.containsKey(more_needed)) {
                return new int[]  {map.get(more_needed),i};
            }
            map.put(num ,i);
        }
        return new int[] {-1,-1};
    }
}
