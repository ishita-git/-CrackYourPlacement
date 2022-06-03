class Solution {
    public int maxArea(int[] height) {
        
        int max = 0;
        int left = 0;
        int right = height.length-1;
        
        while(left<right)
        {
            int w = right-left;
            int h = Math.min(height[left],height[right]);
            int area = w*h;
            max = Math.max(max,area);
            
            if(height[left]<height[right])
                left++;
            else if(height[left]>height[right])
                right--;
            else
            {
                left++;
                right--;
            }
                
        }
        
        return max;
    }
}