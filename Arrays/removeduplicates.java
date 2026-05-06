// Problem : Remove duplicates from sorted array 
// Difficulty : Easy
// Platform : takeuforward
// TC : O(N)
// SC : O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=i;j<nums.length;j++) {
            if(nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
