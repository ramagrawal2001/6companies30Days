package goldman_sach;

public class _5UglyNumbers {

	public static void main(String[] args) {
		System.out.println(getNthUglyNo(10));
	}
	public static long getNthUglyNo(int n) {
        int p2=0,p3=0,p5=0;
        long[] arr=new long[n];
        arr[0]=1;
        for(int i=1;i<n;i++){
            long c2=arr[p2]*2;
            long c3=arr[p3]*3;
            long c5=arr[p5]*5;
            long min=Math.min(c2,Math.min(c3,c5));
            arr[i]=min;
            if(c2==min)p2++;
            if(c3==min)p3++;
            if(c5==min)p5++;
        }
        return arr[n-1];
    }

}
