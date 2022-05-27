import java.util.*;

public class chocDistribution {
    static int findMinDiff(int[] arr,int n,int m)
    {
         if(m==0 || n==0)
           return 0;
         if(n<m)
           return -1;
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i+m-1<n;i++)
        {
            int diff = arr[i+m-1] - arr[i];
            if(diff<min)
              min=diff;
        }
        return min;
    }
    
}
