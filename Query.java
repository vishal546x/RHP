import java.util.*;

public class Query {
    public int calculateSum(int[] arr, int[][] queries, int minL, int maxR) {
        int n=arr.length;
        int[] ans=new int[n];
        Arrays.fill(ans, -1);
        
        HashSet<Integer> visited=new HashSet<>();

        for(int i=queries.length-1;i>=0;i--) {
            if(visited.size()==(maxR-minL+1)) break;

            int l=queries[i][0];
            int r=queries[i][1];
            int x=queries[i][2];
            int y=queries[i][3];

            for(int j=l;j<=r;j++) {
                // Check bounds to prevent ArrayIndexOutOfBoundsException
                if(j>=0 && j<n) {
                    if(ans[j]==-1) {
                        ans[j]=x+((j-l)*y);
                        visited.add(j);
                    }
                }
            }
        }

        int sum=0;
        for(int i=0;i<n;i++) {
            if(ans[i]==-1) {
                sum+=arr[i];
            } else {
                sum+=ans[i];
            }
        }

        return sum;
    }
}
