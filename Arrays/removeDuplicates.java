class Solution {
    public int removeDuplicates(int[] nums) {
        
        int count=1;
        int len=nums.length-1;
        
        for(int i=1;i<=len;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                nums[count++]=nums[i];
            }
        }
        return count;
    }
}