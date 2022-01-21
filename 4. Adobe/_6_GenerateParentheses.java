package adobe;
import java.util.*;

public class _6_GenerateParentheses {
	
	public static List<String> AllParenthesis(int n) 
    {
        List<String> l=new ArrayList<String>();
        f(n,n,"",l);
        return l;
    }
    public static void f(int o,int c,String a,List<String> l){
        if(o==0&&c==0)l.add(a);
        else if(o==c){
            f(o-1,c,a+'(',l);
        }
        else if(o==0){
            f(o,c-1,a+')',l);
        }
        else{
            f(o-1,c,a+'(',l);
            f(o,c-1,a+')',l);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(String s: AllParenthesis(3)) System.out.println(s);
	}

}
