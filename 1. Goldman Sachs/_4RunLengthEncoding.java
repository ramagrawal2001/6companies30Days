package goldman_sach;

public class _4RunLengthEncoding {

	public static void main(String[] args) {
		String st="wwwwaaadexxxxxx";
		System.out.println(encode(st));
	}
	
	public static String encode(String str)
	{
          str+="1";
          String ans="";
          int count=1;
          for(int i=1;i<str.length();i++){
              if(str.charAt(i)!=str.charAt(i-1)){
                  ans+=str.charAt(i-1)+String.valueOf(count);
                  count=1;
              }
              else count++;
          }return ans;
	}

}
