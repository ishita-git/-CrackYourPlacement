class Solution {
    public int maxProfit(int[] prices) {
        
        int max = Integer.MAX_VALUE;
        int op=0;
        int pist=0;
        
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<max)
            {
                max=prices[i];
            }
            
            pist =prices[i]-max;
            if(op<pist)
            {
                op=pist;
            }
        }
        return op;
    }
}

