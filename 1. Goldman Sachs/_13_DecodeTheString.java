package goldman_sach;
import java.util.*;
public class _13_DecodeTheString {

	public static void main(String[] args) {
		System.out.println(decodedString("3[a3[b]1[ab]]"));
	}
	public static String decodedString(String s){
        Stack<Character> st=new Stack<>();
        String temp="";
        String temp2="";
        String num="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==']'){
                while(st.peek()!='['){
                    temp=st.pop()+temp;
                }
                st.pop();
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                    num=st.pop()+num;
                }
                int x=Integer.parseInt(num);
                for(int j=0;j<x;j++){
                    temp2+=temp;
                }
                if(st.isEmpty())return temp2;
                for(int j=0;j<temp2.length();j++){
                    st.push(temp2.charAt(j));
                }
                temp="";
                temp2="";
                num="";
            }
            else{
                st.push(s.charAt(i));
            }
        }return temp;
    }
}
