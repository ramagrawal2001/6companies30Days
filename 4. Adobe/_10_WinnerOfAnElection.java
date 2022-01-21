package adobe;
import java.util.*;

public class _10_WinnerOfAnElection {
	
	public static String[] winner(String arr[], int n)
    {
        HashMap<String,Integer> hs=new HashMap<>();
        String ans="";
        int max=0;
        for(String x:arr){
            hs.put(x,hs.getOrDefault(x,0)+1);
            if(hs.get(x)>max){
                max=hs.get(x);
                ans=x;
            }
        }
        for(Map.Entry<String,Integer> x: hs.entrySet()){
            if(x.getValue()==max && ans.compareTo(x.getKey())>0){
                ans=x.getKey();
            }
        }
        String[] a=new String[2];
        a[0]=ans;
        a[1]= Integer.toString(max);
        return a;
    }

	public static void main(String[] args) {
		int n = 13;
		String Votes[] = {"john","johnny","jackie","johnny","john","jackie","jamie","jamie","john","johnny","jamie","johnny","john"};
		String ans[] = winner(Votes, n);
		System.out.println(ans[0]+" "+ans[1]);
	}

}
