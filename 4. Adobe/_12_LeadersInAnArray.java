package adobe;
import java.util.*;

public class _12_LeadersInAnArray {
	
	static ArrayList<Integer> leaders(int arr[], int n){
        int max=Integer.MIN_VALUE;
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=max){
                st.push(arr[i]);
                max=arr[i];
            }
        }
        ArrayList<Integer> a=new ArrayList<>();
        while(!st.isEmpty()){
            a.add(st.pop());
        }return a;
    }

	public static void main(String[] args) {
		int n = 6;
		int arr[] = {16,17,4,3,5,2};
		System.out.println(leaders(arr, n));
	}

}
