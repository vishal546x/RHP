
import java.util.Arrays;

public class SegmentTree{
    public static void helper(int[]arr){
        int N=arr.length;
        int[]ans=new int[2*N];
        for(int i=0;i<N;i++){
            ans[N+i]=arr[i];
        }
        for(int i=N-1;i>0;i--){
            ans[i]=ans[2*i]+ans[2*i+1];
        }
        System.out.print(Arrays.toString(ans));
    }
    
    public static void main(String[] args) {
        int[]arr={7,10,4,5,2,3,6,5};
        helper(arr);

    }
}
