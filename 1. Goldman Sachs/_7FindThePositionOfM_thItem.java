package goldman_sach;

public class _7FindThePositionOfM_thItem {

	public static void main(String[] args) {
		
		System.out.println(findPosition(5, 2, 1));

	}
	
	public static int findPosition(int N , int M , int K) {
        if(N==1)return 1;
        int ans=M%N+K-1;
        if(ans==N)return ans;
        else return ans%N;
    }

}
