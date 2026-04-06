import java.util.*;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        if(!sc.hasNextInt()) return;

        int n=sc.nextInt();
        int m=sc.nextInt();

        int[][] a=new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                a[i][j]=sc.nextInt();
            }
        }

        int[][] p=new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                p[i][j]=a[i][j];
                if(i>0) p[i][j]+=p[i-1][j];
                if(j>0) p[i][j]+=p[i][j-1];
                if(i>0&&j>0) p[i][j]-=p[i-1][j-1];
            }
        }

        if(!sc.hasNextInt()) return;
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int r2=sc.nextInt();
        int c2=sc.nextInt();

        int sum=p[r2][c2];
        if(r1>0) sum-=p[r1-1][c2];
        if(c1>0) sum-=p[r2][c1-1];
        if(r1>0&&c1>0) sum+=p[r1-1][c1-1];

        System.out.println(sum);
    }
}
