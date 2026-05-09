// Problem : Every integer in the array appears twice except one integer. Find the number that appeared once in the array.
// Platform : takeuforward
// Difficulty : easy
// TC : O(N)
// SC : O(1)

class Solution {
    public int singleNumber(int[] nums) {
        //your code goes here
        for(int i=0;i<nums.length;i++) {
            int count =0;
            for(int j=0; j<nums.length;j++) {
                if(nums[i] == nums[j]) {
                    count++;
                }
            }
            if(count ==1) {
                return nums[i];
            }
        }
        return -1;
    }
}
