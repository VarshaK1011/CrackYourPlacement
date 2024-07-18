class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int j=0;
        int k=nums.length-1;
        while(j<=k)
        {
           switch(nums[j])
           {
            case 0:swap(nums,i,j);
                i++;
                j++;
                break;
            case 1:j++;
                break;
            case 2:swap(nums,j,k);
                k--;
                break;
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