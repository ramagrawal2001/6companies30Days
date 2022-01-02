package goldman_sach;

public class _6greatestCommonDivisorOfStrings {

	public static void main(String[] args) {
		System.out.println(gcdOfStrings("ABABABAB", "ABAB"));
	}
	public static String gcdOfStrings(String str1, String str2) {
        int n1=str1.length();
        int n2=str2.length();
        if(n1>n2){
            String s=str1;
            str1=str2;
            str2=s;
            int n=n1;
            n1=n2;
            n2=n;
        }
        for(int i=n1;i>=1;i--){
            if(n1%i!=0 || n2%i!=0)continue;
            boolean b=true;
            String s=str1.substring(0,i);
            for(int j=0;j<n1;j+=i){
                String st=str1.substring(j,j+i);
                if(!s.equals(st)){
                    b=false;
                    break;
                }
            }
            if(!b)continue;
            for(int j=0;j<n2;j+=i){
                String st=str2.substring(j,j+i);
                if(!s.equals(st)){
                    b=false;
                    break;
                }
            }
            if(!b)continue;
            return s;
        }
        return "";
    }
}
