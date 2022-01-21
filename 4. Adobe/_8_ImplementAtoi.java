package adobe;

public class _8_ImplementAtoi {
	
	public static int atoi(String s) {
        int ans=0;
        int y=1;
        if(s.length()>1 && s.charAt(0)=='-'){
            s=s.substring(1,s.length());
            y=-1;
        }
	    for(int i=0;i<s.length();i++){
	        char c=s.charAt(i);
	        if(c>=48 && c<=57){
	            int x=(int)c-48;
	            ans=ans*10+x;
	        }
	        else return -1;
	    }return ans*y;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "12345";
		System.out.println(atoi(s));
	}
}
