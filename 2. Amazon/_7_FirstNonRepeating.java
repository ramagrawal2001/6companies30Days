import java.util.ArrayDeque;
import java.util.Queue;

public class _7_FirstNonRepeating {
    public static String firstNonRepeating(String A) {
        int l = A.length(), j = 0;
        int iR[] = new int[26];
        StringBuilder ret = new StringBuilder();
        Queue<Character> q = new ArrayDeque<>();
        for (int i = 0; i < l; i++) {
            char ch = A.charAt(i);
            if (iR[ch - 'a'] == 0)
                q.add(ch);
            iR[ch - 'a']++;
            while (!q.isEmpty() && iR[q.peek() - 'a'] > 1)
                q.poll();
            ret.append(q.isEmpty() ? "#" : q.peek());
        }
        return ret.toString();
    }

    public static void main(String[] args) {
        String s = "aabc";
        System.out.println(firstNonRepeating(s));
    }
}
