import java.util.*;

public class _5_PhoneDirectory {
    static ArrayList<ArrayList<String>> displayContacts(int n,
            String c[], String s) {
        ArrayList<ArrayList<String>> al = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < s.length(); i++) {
            ArrayList<String> a = new ArrayList<String>();
            Set<String> set = new HashSet<>();
            for (int j = 0; j < n; j++) {
                if (c[j].length() > i && c[j].substring(0, i + 1).equals(s.substring(0, i + 1))) {
                    if (!set.contains(c[j])) {
                        set.add(c[j]);
                        a.add(c[j]);
                    }
                }
            }
            Collections.sort(a);
            if (!a.isEmpty())
                al.add(a);
            else {
                a.add("0");
                al.add(a);
            }
        }
        return al;
    }
    public static void main(String[] args) {
        String contact[] =new String[]{"geeikistest", "geeksforgeeks", 
"geeksfortest"};
        ArrayList<ArrayList<String>> ans=displayContacts(3, contact, "geeips");
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(i).size();j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
