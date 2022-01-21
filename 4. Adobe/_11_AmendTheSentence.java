package adobe;

public class _11_AmendTheSentence {
	
	public static String amendSentence(String s){
        String ans="";
        int j=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90){
                if(ans.length()==0){
                    ans+=s.substring(j,i).toLowerCase();
                }
                else{
                    ans+=" "+s.substring(j,i).toLowerCase();
                }
                j=i;
            }
        }
        if(ans.length()==0){
            ans+=s.substring(j,s.length()).toLowerCase();
        }
        else{
            ans+=" "+s.substring(j,s.length()).toLowerCase();
        }return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "BruceWayneIsBatman";
		System.out.println(amendSentence(s));
	}

}
