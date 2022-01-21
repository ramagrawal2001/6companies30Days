package adobe;

public class _9_NextHigherPalindromicNumberUsingTheSameSetOfDigits {
	
	public static String nextPalin(String N) 
    { 
        int n=N.length();
        if(n<=2)return "-1";
        String s=N.substring(0,n/2);
        String s1=f(s);
        if(s1.equals("-1"))return "-1";
        else{
            StringBuilder s2=new StringBuilder(s1);
            s2.reverse();
            if(n%2!=0){
                return (s1+N.charAt(n/2)+s2);
            }
            else{
                return s1+s2;
            }
        }
    }
    public static String f(String s){
        char[] c=s.toCharArray();
        int n=c.length;
        for(int i=n-1;i>0;i--){
            if(c[i]>c[i-1]){
                for(int j=n-1;j>=i;j--){
                    if(c[j]>c[i-1]){
                        char ch=c[j];
                        c[j]=c[i-1];
                        c[i-1]=ch;
                        break;
                    }
                }
                int x=i,y=n-1;
                while(x<y){
                    char ch=c[x];
                    c[x]=c[y];
                    c[y]=ch;
                    x++;
                    y--;
                }
                String str = new String(c);
                return str;
            }
        }return "-1";
    }

	public static void main(String[] args) {
		String s = "35435";
		System.out.println(nextPalin(s));
	}

}
