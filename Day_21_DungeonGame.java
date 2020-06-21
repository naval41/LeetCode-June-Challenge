class Solution {
    public int calculateMinimumHP(int[][] A) {
    
    int n = A.length;
    if(n==0) return 0;
    int m = A[0].length;
    
    int dp[][]=new int[n][m];
        
    dp[n-1][m-1] = Math.min(A[n-1][m-1],0);
    
    for(int i=(m-2); i>=0; i--){    //row wise 
        dp[n-1][i] = min(0, A[n-1][i], A[n-1][i] + dp[n-1][i+1]);
    }
        
    for(int i=(n-2); i>=0; i--){    //Column wise
        dp[i][m-1] = min(0, A[i][m-1], A[i][m-1] + dp[i+1][m-1]);
    }
        
    for(int i=(n-2); i>=0; i--){
        for(int j=(m-2); j>=0; j--){
            int bestNeighbor = Math.max(dp[i][j+1], dp[i+1][j]);
            dp[i][j] = min(0, A[i][j], A[i][j] + bestNeighbor);
        }
    }
    
    
        return Math.abs(dp[0][0])+1;   
    }
    
    
    public int min(int a,int b, int c){
        return Math.min(a,Math.min(b,c));
    }
}
