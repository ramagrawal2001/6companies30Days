package goldman_sach;

public class _3CountTheSubarraysHavingProductLessThanK {

	public static void main(String[] args) {
		long arr[] = {1, 9, 2, 8, 6, 4, 3};
		int count = countSubArrayProductLessThanK(arr,arr.length,100);
		System.out.println(count);
	}
	
	public static int countSubArrayProductLessThanK(long a[], long n, long k)
    {
        int j=0;
        int count=0;
        long mul=1;
        for(int i=0;i<n;i++){
            mul=(long)mul*a[i];
            while(mul>=k &&j<n){
                mul=(long)mul/a[j];
                j++;
            }
            count+=i-j+1;
        }return count;
    }

}
