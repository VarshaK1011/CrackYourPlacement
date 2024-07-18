class Solution {
    public int removeDuplicates(int[] nums) {
        int start=0;
        int count=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                nums[++start]=nums[i];
                count++;
            }
        }
        return count;
    }
}