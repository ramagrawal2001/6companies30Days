package goldman_sach;

public class _8TotalDecodingMessages {

	public static void main(String[] args) {
		System.out.println(CountWays("6738920214"));
	}
	
	public static int CountWays(String str)
    {
        int n=str.length();
        int[] a=new int[n];
        a[0]=1;
        if(str.charAt(0)=='0')return 0;
        int mod=1000000007;
        for(int i=1;i<n;i++){
            if(str.charAt(i-1)=='0'&& str.charAt(i)=='0'){
                return 0;
            }
            else if(str.charAt(i-1)=='0'){
                a[i]=a[i-1];
            }
            else if(str.charAt(i)=='0'){
                if(str.charAt(i-1)=='1' || str.charAt(i-1)=='2'){
                    a[i]=(i>=2?a[i-2]:1);
                }
                else {
                    return 0;
                }
            }
            else{
                int x=Integer.parseInt(str.substring(i-1,i+1));
                if(x<=26){
                    a[i]=(a[i-1]+(i>=2?a[i-2]:1))%mod;
                }
                else{
                    a[i]=a[i-1];
                }
            }
        }return a[n-1];
    }

}
