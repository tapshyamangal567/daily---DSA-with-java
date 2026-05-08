// Problem : Left rotate an array by one place
// Platform : trakeuforward
// Difficulty : Easy
// TC : O(n)
// SC : O(1)


class Solution {
    public void rotateArrayByOne(int[] nums) {
        int n = nums.length;
        int temp = nums[0];
        for(int i=0;i<n-1;i++) {
            nums[i] = nums[i+1];
        }
        nums[n-1] = temp;
    }
}
