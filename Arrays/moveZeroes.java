class Solution {
    public void moveZeroes(int[] nums)
    {
      int count = 0;
      for(int i=0;i<nums.length;i++)
      {
        if(nums[i]!=0)
        {
          int x= nums[i];
          nums[i]=nums[count];
          nums[count]=x;
          count++;
        }
      }
    }
    }
