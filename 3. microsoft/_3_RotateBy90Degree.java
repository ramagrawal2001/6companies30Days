package microsoft;

public class _3_RotateBy90Degree {

	public static void main(String[] args) {
		int m[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int n=m.length;
		for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
		rotate(m);
		System.out.println();
		for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
	}
	public static void rotate(int m[][]) 
    {
        int n=m.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            int low=0,high=n-1;
            while(low<high){
                int temp=m[low][i];
                m[low][i]=m[high][i];
                m[high][i]=temp;
                low++;
                high--;
            }
        }
    }
}
