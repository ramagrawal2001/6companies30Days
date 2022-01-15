package microsoft;
import java.util.*;
public class _6_PossibleWordsFromPhoneDigits {

	public static void main(String[] args) {
		int N = 3;
		int a[] =new int[]{2, 3, 4};
		ArrayList<String> words=possibleWords(a, N);
		System.out.println(words);
	}
	public static ArrayList <String> possibleWords(int a[], int N)
    {
        return solve(a,N,0);
    }
    
	public static String keypad[] = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static ArrayList<String> solve(int a[], int N,int i){
        if(i==N){
            ArrayList<String> cres=new ArrayList<>();
            cres.add("");
            return cres;
        }
        int n=a[i];
        i++;
        ArrayList<String> rres=solve(a,N,i);
        ArrayList<String> cres=new ArrayList<>();
        for(int j=0;j<keypad[n].length();j++){
            char ch=keypad[n].charAt(j);
            for(String s:rres){
                cres.add(ch+s);
            }
        }
        return cres;
    }
}
