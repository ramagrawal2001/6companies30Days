package goldman_sach;
import java.util.*;
public class _10_FindMax10NumbersInAListHaving10MEntries {

	public static void main(String[] args) {	
		int[] a=new int[] {1, 2, 3, 43, 5, 6, 17, 8, 9, 90, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		int ans[] = max10(a);
		for(int i=0;i<10;i++) {
			System.out.print(ans[i]+" ");
		}System.out.println();
	}
	
	public static int[] max10(int[] a){
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int n=a.length;
		for(int i=0;i<n;i++) {
			pq.add(a[i]);
			if(pq.size()>10) {
				pq.poll();
			}
		}
		int[] ans=new int[10];
		int i=9;
		while(!pq.isEmpty()) {
			ans[i]=pq.poll();
			i--;
		}
		return ans;
	}

}
