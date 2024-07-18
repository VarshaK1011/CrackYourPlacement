class Solution {
    public int findDuplicate(int[] nums) {
        int ans=-1;
        for(int i=0;i<nums.length;i++)
        {
           if(nums[Math.abs(nums[i])-1]>0)
           {
                nums[Math.abs(nums[i])-1]*=-1;
           }
           else
           {
                ans=Math.abs(nums[i]);
                break;
           }
        }
        return ans;
    }
}