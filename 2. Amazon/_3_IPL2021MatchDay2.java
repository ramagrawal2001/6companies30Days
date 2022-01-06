package amazon;
import java.util.*;
public class _3_IPL2021MatchDay2 {

	public static void main(String[] args) {
		int[] a=new int[] {1,2,3,1,4,5,2,3,6};
		ArrayList<Integer> arr=max_of_subarrays(a, 9, 3);
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
	public static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        Deque<Integer> dq=new LinkedList<Integer>();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && arr[i]>arr[dq.peekLast()])dq.removeLast();
            dq.addLast(i);
        }
        for(int i=k;i<n;i++){
            a.add(arr[dq.peekFirst()]);
            while(!dq.isEmpty() && dq.peekFirst()<=i-k)dq.removeFirst();
            while(!dq.isEmpty() && arr[i]>arr[dq.peekLast()])dq.removeLast();
            dq.addLast(i);
        }
        a.add(arr[dq.peekFirst()]);
        return a;
    }
}
