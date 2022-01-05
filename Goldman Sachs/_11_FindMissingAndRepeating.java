package goldman_sach;

public class _11_FindMissingAndRepeating {

	public static void main(String[] args) {
		int arr[]=new int[] {1, 3, 3};
		int a[] =findTwoElement(arr, 3);
		System.out.println(a[0]+" "+a[1]);
	}
	public static int[] findTwoElement(int arr[], int n) {
        int[] a=new int[2];
        for(int i=0;i<n;i++){
            if(arr[Math.abs(arr[i])-1]>0)arr[Math.abs(arr[i])-1]*=-1;
            else a[0]=Math.abs(arr[i]);
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0)a[1]=i+1;
        }
        return a;
    }
}
