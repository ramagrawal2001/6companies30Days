package goldman_sach;

public class _2OverlappingRectangles {

	public static void main(String[] args) {
		int L1[] = {0,10};
		int R1[] = {10,0};
		int L2[] = {5,5};
		int R2[] = {15,0};
		System.out.println(doOverlap(L1,R1,L2,R2));
	}
	static int doOverlap(int L1[], int R1[], int L2[], int R2[]) {
        if(R1[0]<L2[0]||R2[0]<L1[0]||L1[1]<R2[1]||L2[1]<R1[1])return 0;
        return 1;
    }
}
