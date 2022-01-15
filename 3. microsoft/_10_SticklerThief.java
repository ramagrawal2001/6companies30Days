package microsoft;

public class _10_SticklerThief {

	public static void main(String[] args) {
		int n = 6;
		int a[] =new int[]{5,5,10,100,10,5};
		System.out.println(FindMaxSum(a, n));
	}
	public static int FindMaxSum(int arr[], int n)
    {
        if(n==1) return arr[0];
        if(n==2) return Math.max(arr[0],arr[1]);
        int inc=arr[0];
        int exc=0;
        for(int i=1;i<n;i++){
            int x=exc;
            exc=Math.max(exc,inc);
            inc=x+arr[i];
        }
        return (int)Math.max(inc,exc);
    }
}
