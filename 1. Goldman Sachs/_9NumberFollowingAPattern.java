package goldman_sach;

import java.util.*;

public class _9NumberFollowingAPattern {

	public static void main(String[] args) {
		
		System.out.println(printMinNumberForPattern("IIDDD"));
		
	}
	
	public static String printMinNumberForPattern(String S){
        Stack<Integer> st=new Stack<>();
        String ans="";
        for(int i=0;i<=S.length();i++){
            st.push(i+1);
            if(i==S.length()||S.charAt(i)=='I'){
                while(!st.isEmpty()){
                    ans+=String.valueOf(st.pop());
                }
            }
        }
        return ans;
    }

}
