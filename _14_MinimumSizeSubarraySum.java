package goldman_sach;

public class _14_MinimumSizeSubarraySum {

	public static void main(String[] args) {
		int[] arr=new int[] {2,3,1,2,4,3};
		System.out.println(minSubArrayLen(7, arr));
	}
	public static int minSubArrayLen(int target, int[] nums) {
        int curr=0,j=0,min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            curr+=nums[i];
            while(curr>=target){
                curr -= nums[j];
                min = Math.min(min,i-j+1);
                j++;
            }
        }return min==Integer.MAX_VALUE?0:min;
    }
}
