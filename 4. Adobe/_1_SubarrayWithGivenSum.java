package adobe;
import java.util.*;

public class _1_SubarrayWithGivenSum {
	
	public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        int sum=arr[0],p=0;
        for(int i=1;i<=n;i++){
            while(sum>s && p<i-1){
                sum-=arr[p];
                p++;
            }
            if(sum==s){
                ArrayList<Integer> a=new ArrayList<Integer>();
                a.add(p+1);
                a.add(i);
                return a;
            }
            if(i<n)sum+=arr[i];
        }
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(-1);
        return a;
    }

	public static void main(String[] args) {
		int n = 5, s = 12;
		int arr[] = {1,2,3,7,5};
		System.out.println(subarraySum(arr, n, s));
	}

}
