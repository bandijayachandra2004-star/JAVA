class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans =new int[nums.length];
        for (int num=0 ; num<nums.length;num++){
            ans[num] =nums[nums[num]];
    }System.gc();
    return ans;
    }
}
