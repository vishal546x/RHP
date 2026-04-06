import java.util.*;

public class DP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        if(!sc.hasNextInt()) return;
        
        int R=sc.nextInt();
        int C=sc.nextInt();
        
        int[][] mat=new int[R][C];
        int[][] res=new int[R][C];

        for(int i=0;i<R;i++) {
            for(int j=0;j<C;j++) {
                mat[i][j]=sc.nextInt();
            }
        }

        int max1=-1,max2=-1;

        for(int j=0;j<C;j++) {
            if(mat[0][j]>max1) {
                max2=max1;
                max1=mat[0][j];
            } else if(mat[0][j]>max2) {
                max2=mat[0][j];
            }
            res[0][j]=mat[0][j];
        }

        for(int i=1;i<R;i++) {
            int maxr1=-1,maxr2=-1;
            for(int j=0;j<C;j++) {
                if(res[i-1][j]==max1) {
                    res[i][j]=mat[i][j]+max2;
                } else {
                    res[i][j]=mat[i][j]+max1;
                }

                if(res[i][j]>maxr1) {
                    maxr2=maxr1;
                    maxr1=res[i][j];
                } else if(res[i][j]>maxr2) {
                    maxr2=res[i][j];
                }
            }
            max1=maxr1;
            max2=maxr2;
        }

        System.out.println(max1);
        display(res);
    }

    public static void display(int[][] mat) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat[0].length;j++) {
                sb.append(mat[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}
