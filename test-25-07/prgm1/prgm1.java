package test;

import java.util.Scanner;

public class prgm1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String num=str.replaceAll("[^0-9]","");
        String op=str.replaceAll("[^+-/*]","");
        int x=0;
        int ans=Integer.parseInt(String.valueOf(num.charAt(0)));
        for (int i = 1; i < num.length(); i++) {
            int n2=Integer.parseInt(String.valueOf(num.charAt(i)));
            switch (op.charAt(x++))
            {
                case '+':
                    ans+=n2;
                    break;
                case '-':
                    ans-=n2;
                    break;
                case '/':
                    ans/=n2;
                    break;
                case '*':
                    ans*=n2;
                    break;
            }
        }
        System.out.println(ans);
    }
}
