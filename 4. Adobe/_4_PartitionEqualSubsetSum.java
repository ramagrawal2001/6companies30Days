package adobe;

public class _4_PartitionEqualSubsetSum {
	
	static int equalPartition(int N, int arr[])
    {
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=arr[i];
        }
        if(sum%2!=0)return 0;
        else return isSubsetSum(N,arr,(sum/2))?1:0;
    }
    static Boolean isSubsetSum(int n, int arr[], int sum){
        boolean[][] dp=new boolean[n+1][sum+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(i==0)dp[i][j]=false;
                if(j==0)dp[i][j]=true;
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(arr[i-1]<=j)dp[i][j]=dp[i-1][j]||dp[i-1][j-arr[i-1]];
                else dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][sum];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int arr[] = {1,5,11,5};
		System.out.println(equalPartition(n, arr));
	}

}
