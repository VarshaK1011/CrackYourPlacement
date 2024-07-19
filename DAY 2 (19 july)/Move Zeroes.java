class Solution {
    public void moveZeroes(int[] nums) {
        int j=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                j=i;
                break;
            }
        }
        if(j==-1)
        {
            return;
        }
        for(int k=j+1;k<nums.length;k++)
        {
            if(nums[k]!=0)
            {
                swap(nums,j,k);
                j++;
            }
        }
    }
    public static void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}