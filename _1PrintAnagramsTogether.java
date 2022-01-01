package goldman_sach;

import java.util.*;

public class _1PrintAnagramsTogether {

	public static void main(String[] args) {
		String words[] = {"act","god","cat","dog","tac"};
		List<List<String>> ans = Anagrams(words);
		for(int i=0;i<ans.size();i++) {
			for(String s: ans.get(i)) System.out.print(s+" ");
			System.out.println();
		}
	}
	static public List<List<String>> Anagrams(String[] ar) {
        List<List<String>>ans=new ArrayList<>();
        HashMap<String,List<String>>mp=new HashMap<>();
	    for(int i=0;i<ar.length;i++){
		    char []ch=ar[i].toCharArray();
		    Arrays.sort(ch);
		    String word=Arrays.toString(ch);
		    if(mp.containsKey(word)){
		       mp.get(word).add(ar[i]);  
		    }
		    else{
		       List<String>a=new ArrayList<>();
		        a.add(ar[i]);
		        mp.put(word,a);  
		    } 
		}  
		for (String s : mp.keySet()) {
            List<String> values = mp.get(s);
            ans.add(values);
		}
		return ans;
    }
}
