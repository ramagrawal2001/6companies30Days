package amazon;

public class _1_MaximumProfit {
	
	static int maxProfit(int k, int n, int arr[]) {
        int dp[][] = new int[k+1][n];
        for(int i=1;i<=k;i++){
            int max = Integer.MIN_VALUE;
            for(int j=1;j<n;j++){
                max = Math.max(dp[i-1][j-1]-arr[j-1],max);
                dp[i][j] = Math.max(dp[i][j-1],max+arr[j]);
            }
        }
        return dp[k][n-1];
    }

	public static void main(String[] args) {

		int k = 3;
		int n = 8;
		int arr[] = {11, 2, 80, 3, 55, 61, 45, 82};
		System.out.println(maxProfit(k,n,arr));
	}

}