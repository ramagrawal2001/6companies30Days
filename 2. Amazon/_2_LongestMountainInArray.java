package amazon;

public class _2_LongestMountainInArray {

	public static void main(String[] args) {
		int[] a =new int[] {2,1,4,7,3,2,5};
		System.out.println(longestMountain(a));
	}
	public static int longestMountain(int[] a) {
        int n=a.length;
        int c=0;
        int max=0;
        boolean b=false;
        int[] p=new int[n];
        int[] s=new int[n];
        p[0]=0;
        for(int i=1;i<n;i++){
            if(a[i]>a[i-1]){
                c++;
                p[i]=c;
            }
            else{
                c=0;
            }
        }
        c=0;
        for(int i=n-2;i>0;i--){
            if(a[i]>a[i+1]){
                c++;
                s[i]=c;
            }
            else{
                c=0;
            }
        }
        for(int i=1;i<n-1;i++){
            if(p[i]!=0 && s[i]!=0){
                max=Math.max(max,p[i]+s[i]+1);
            }
        }
        return max;
    }
}
