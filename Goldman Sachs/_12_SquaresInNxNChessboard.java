package goldman_sach;

public class _12_SquaresInNxNChessboard {

	public static void main(String[] args) {
		
		System.out.println(squaresInChessBoard((long)100));

	}
	public static Long squaresInChessBoard(Long n) {
        return (n*(n+1)*(2*n+1))/6;
    }
}
