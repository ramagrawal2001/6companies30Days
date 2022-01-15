package microsoft;
import java.util.*;
public class _11_GenerateBinaryNumbers {

	public static void main(String[] args) {
		System.out.println(generate(20));
	}
	public static ArrayList<String> generate(int N)
    {
        Queue<String> q = new LinkedList<String>();
        ArrayList<String> list = new ArrayList<String>();
        
        q.add("1");
        
        for(int i = 0; i < N; i++){
            String curr = q.poll();
            list.add(curr);
            q.add(curr + "0");
            q.add(curr + "1");
        }
        return list;
    }
}
