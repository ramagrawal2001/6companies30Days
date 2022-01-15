package microsoft;
import java.util.*;
public class _5_StockSpanProblem {

	public static void main(String[] args) {
		int N = 7;
		int price[] =new int[] {100,80,60,70,60,75,85};
		price=calculateSpan(price, N);
		for(int i=0;i<price.length;i++) {
			System.out.print(price[i]+" ");
		}System.out.println();
	}
	public static int[] calculateSpan(int price[], int n)
    {
        int[] a=new int[n];
        a[0]=1;
        ArrayDeque<Integer> s=new ArrayDeque<Integer>();
        s.push(0);
        for(int i=1;i<n;i++){
            while(!s.isEmpty() && price[s.peek()]<=price[i]){
                s.pop();
            }
            a[i]=s.isEmpty()?i+1:i-s.peek();
            s.push(i);
        }
        return a;
    }
}
