class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        int[] count = new int[k];
        int sum = 0;
        
        for(int n:nums)
        {
            sum+= (n%k +k)%k;
            count[sum%k]++;
        }
        
        int result=count[0];
        for(int c:count)
        {
            result += c*(c-1)/2;
        }
        return result;
    }
}