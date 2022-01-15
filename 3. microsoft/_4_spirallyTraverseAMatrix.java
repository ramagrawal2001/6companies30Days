package microsoft;
import java.util.*;
public class _4_spirallyTraverseAMatrix {

	public static void main(String[] args) {
		int m[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int n=m.length;
		for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
		ArrayList<Integer> a=spirallyTraverse(m,3,3);
		System.out.println(a);
	}
	static ArrayList<Integer> spirallyTraverse(int m[][], int r, int c)
    {
        int top=0,right=c-1,bottom=r-1,left=0;
        ArrayList<Integer> a=new ArrayList<Integer>();
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                a.add(m[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                a.add(m[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    a.add(m[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    a.add(m[i][left]);
                }
                left++;
            }
        }return a;
    }
}
