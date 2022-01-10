import java.util.*;
public class _10_NutsAndBoltsProblem {
    public static void matchPairs(char nuts[], char bolts[], int n) {
        char[] arr = new char[] { '0', '0', '0', '0', '0', '0', '0', '0', '0' };
        for (int i = 0; i < n; i++) {
            if (nuts[i] == '!')
                arr[0] = '!';
            else if (nuts[i] == '#')
                arr[1] = '#';
            else if (nuts[i] == '$')
                arr[2] = '$';
            else if (nuts[i] == '%')
                arr[3] = '%';
            else if (nuts[i] == '&')
                arr[4] = '&';
            else if (nuts[i] == '*')
                arr[5] = '*';
            else if (nuts[i] == '@')
                arr[6] = '@';
            else if (nuts[i] == '^')
                arr[7] = '^';
            else
                arr[8] = '~';
        }
        int count = 0;
        for (int i = 0; i < 9; i++) {
            if (arr[i] != '0') {
                nuts[count] = arr[i];
                bolts[count] = arr[i];
                count++;
            }
        }
    }
    public static void main(String[] args) {
        int n = 9;
        char nuts[] = { '^', '&', '%', '@', '#', '*', '$', '~', '!' };
        char bolts[] = { '~', '#', '@', '%', '&', '*', '$', '^', '!' };
        matchPairs(nuts, bolts, n);
        for (char c : nuts)
            System.out.print(c + " ");
        System.out.println();
        for (char c : bolts)
            System.out.print(c + " ");
        System.out.println();
    }
}
