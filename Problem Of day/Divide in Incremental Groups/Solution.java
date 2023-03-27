class Solution {
    public int countWaystoDivide(int N, int K) {
        
        int[] arr=new int[N];
        
        for(int i=0;i<N;i++) arr[i]=i+1;
        
        int[][][] dp=new int[N+1][N+1][K+1];
        
        for(int i=N;i>=0;i--){
            for(int j=N;j>=0;j--){    
                for(int k=0;k<=K;k++){
                    if(i==N) dp[i][j][k]=0;
                    else if(j>N) dp[i][j][k]=0;
                    else if(k==0)
                    {
                        if(j==N) dp[i][j][k]=1;
                        else dp[i][j][k]=0;
                    }
                    else{
                        if(j+arr[i]<=N)
                            dp[i][j][k]=dp[i][j+arr[i]][k-1]+dp[i+1][j][k];
                        else
                            dp[i][j][k]=dp[i+1][j][k];
                    }
                }
            }
        }
       
            return dp[0][0][K];
        
    }
}
