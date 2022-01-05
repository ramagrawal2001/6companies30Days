package goldman_sach;
import java.util.*;
public class _15_ArrayPairSumDivisibilityProblem {

	public static void main(String[] args) {
		int[] arr=new int[] {9, 5, 7, 3};
		System.out.println(canPair(arr, 6));
	}
	public static boolean canPair(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i]%k,m.getOrDefault(nums[i]%k,0)+1);
        }
        for(int i=0;i<nums.length;i++){
            int r1=nums[i]%k;
            int r2=k-r1;
            if(r1==r2 || r1==0){
                if(m.get(r1)%2!=0)return false;
            }
            else if(!m.containsKey(r2))return false;
            else if(m.get(r1)!=m.get(r2))return false;
        }return true;
    }
}
