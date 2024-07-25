package test;

import java.util.*;

public class prgm4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(in.nextInt());
        }
        ArrayList<Integer> st=new ArrayList<>(arr);
        Collections.sort(st);
        HashMap<Integer,Character> hm=new HashMap<>();
        for (int i = 0; i < n; i++) {
            hm.put(st.get(i), (char)(i+97));
        }
        ArrayList<Character> ans=new ArrayList<>();
        for (int x:arr)
        {
            ans.add(hm.get(x));
        }
        System.out.println(ans);
    }
}
