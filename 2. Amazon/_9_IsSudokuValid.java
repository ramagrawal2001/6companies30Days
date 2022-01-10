import java.util.*;
public class _9_IsSudokuValid {
    public static int isValid(int mat[][]) {
        for (int i = 0; i < 9; i++) {
            Set<Integer> s1 = new HashSet<>();
            Set<Integer> s2 = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (mat[i][j] != 0 && s1.contains(mat[i][j]))
                    return 0;
                else
                    s1.add(mat[i][j]);
                if (mat[j][i] != 0 && s2.contains(mat[j][i]))
                    return 0;
                else
                    s2.add(mat[j][i]);
            }
        }
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                Set<Integer> s = new HashSet<>();
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        if (mat[k][l] != 0 && s.contains(mat[k][l]))
                            return 0;
                        else
                            s.add(mat[k][l]);
                    }
                }
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int mat[][] = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
        System.out.println(isValid(mat));
    }
}
