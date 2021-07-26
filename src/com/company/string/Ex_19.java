package com.company.string;

import java.util.*;

//Consecutive
public class Ex_19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b,m,n,y=0;
        String st,d="";
        char p,q;
        System.out.print("Enter a string: ");
        st=s.nextLine();
        st=st.trim();
        st=" "+st+" ";
        st=st.toUpperCase();
        a=st.length();
        for(b=0;b<a-1;b++)
        {
            p=st.charAt(b);
            q=st.charAt(b+1);
            m=p;
            n=q;
            if(q!=' ')
            {
                d= d+q;
                if(n-m==1)
                {
                    y=1;
                }
            }
            if((q==' ')&&(y==0))
            {
                d="";
            }
            if((q==' ')&&(y==1))
            {
                System.out.println(d);
                y=0;
                d="";
            }
        }
    }
}