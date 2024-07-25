package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class prgm5 {
    static boolean isprime(int n)
    {
        if(n==1 || n==0)
            return false;
        for (int i=2;i<n/2+1;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(in.nextInt());
        }
        int cnt=0,ans=0;
        Collections.sort(arr);
        for (int i = 0; i < n; i++) {
            int num=arr.get(i);
            if(isprime(num))
            {
                cnt++;
                if (cnt!=1)
                {
                    ans+=num;
                }
            }
        }
        System.out.println("Output :"+ans);
    }
}
