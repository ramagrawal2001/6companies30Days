import java.util.*;
public class _6_max_of_subarrays {
    public static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();
        int i = 0;
        for (i = 0; i < k; i++) {
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        for (; i < n; i++) {
            list.add(arr[dq.peek()]);
            while (!dq.isEmpty() && dq.peek() <= i - k)
                dq.removeFirst();
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        list.add(arr[dq.peek()]);
        return list;
    }

    public static void main(String[] args) {
        int n = 9;
        int k = 3;
        int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        System.out.println(max_of_subarrays(arr, n, k));
    }
}