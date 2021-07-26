package com.company.string;

import java.util.Scanner;

public class Ex_16 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a,b,m,n,y=0;
        String st,d="";
        char p,q;
        System.out.print("Enter a string: ");
        st=s.nextLine();
        st=st.trim();
        st=st.toUpperCase();
        a=st.length();
        s.close();
        for(m=65;m<=122;m++)
        {
            q=(char)m;
            y=0;
            for(b=0;b<a;b++)
            {
                p=st.charAt(b);
                if(p==q)
                {
                    y++;
                }
            }
            if(y>0)
            {
                System.out.println(q+" "+y);
            }
        }
        System.out.println(d);
    }
}
