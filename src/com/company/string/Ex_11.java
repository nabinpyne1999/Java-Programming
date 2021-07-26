package com.company.string;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b,m,n,y=0;
        String st,d="";
        char p,q;
        System.out.print("Enter a string: ");
        st=s.nextLine();
        st=" "+st+" ";
        st=st.toUpperCase();
        a=st.length();
        for(b=0;b<a-1;b++)
        {
            p=st.charAt(b);
            q=st.charAt(b+1);
            m=p;
            n=q;
            if (p == 'A' || p == 'E' || p == 'I' || p == 'O' || p == 'U') {
                y++;
            }
            if(p==' ')
            {
                if(n>m)
                {
                    d="";

                    y=0;
                }

            }
        }
    }
}
