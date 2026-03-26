public static int dp1(int[][]arr){
        int R=arr.length;
        int C=arr[0].length;
        int[][]dp=new int[R][C];
        int max1=-1;
        int max2=-1;
        for(int i=0;i<C;i++){
            dp[0][i]=arr[0][i];
            if(max1<=dp[0][i]){
                max2=max1;
                max1=dp[0][i];
               
            }
            else if(max2<=dp[0][i]){
                max2=dp[0][i];
            }

        }
       // System.out.println(max1+" "+max2);
        for(int i=1;i<R;i++){
            int tmax1=-1;
            int tmax2=-1;

            for(int j=0;j<C;j++){

                if(max1==dp[i-1][j]){
                    dp[i][j]=max2+arr[i][j];
                }
                else dp[i][j]=max1+arr[i][j];

                if(tmax1<=dp[i][j]){
                     tmax2=tmax1;
                    tmax1=dp[i][j];
                   
                }
                else if(tmax2<=dp[i][j]){
                    tmax2=dp[i][j];
                }
            }
            max1=tmax1;
            max2=tmax2;
        }
        display(dp);
        return max1;
    }
    public static void display(int[][]arr){
        for(int[]ar:arr){
            for(int i:ar)System.out.print(i+" ");
            System.out.println();
        }
    }
