class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        Set<Integer> keys=hm.keySet();
        Iterator i=keys.iterator();
       for(Integer keyy:keys)
       {
           if(hm.get(keyy)>(nums.length/2))
           {
               return keyy;
           }
       }
       return -1;
    }
}