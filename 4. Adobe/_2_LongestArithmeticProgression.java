package adobe;
import java.util.*;

public class _2_LongestArithmeticProgression {
	
	public static int lengthOfLongestAP(int[] A, int n) {
        if(n==1)return 1;
        HashMap<Integer,Integer>[] dp=new HashMap[n];
        int maxValue=1;
        for(int i=0;i<n;i++){
            int curr=A[i];
            HashMap<Integer,Integer> cm=new HashMap<Integer,Integer>();
            dp[i]=cm;
            for(int j=0;j<i;j++){
                int diff=curr-A[j];
                cm.put(diff,dp[j].getOrDefault(diff,0)+1);
                maxValue=Math.max(cm.get(diff),maxValue);
            }
        }
        
        return maxValue+1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int arr[] = {1, 7, 10, 13, 14, 19};
		System.out.println(lengthOfLongestAP(arr, n));
	}

}
