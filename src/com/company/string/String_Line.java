package com.company.string;
import  java.util.*;
public class String_Line {
    public static void main(String[] args) {
        int c,d;
        char b;
        String a,g="";
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a string: ");
        a=s.nextLine();
        a=a+"";
        c=a.length();
        for(d=0;d<c;d++)
        {
            b=a.charAt(d);
            if(b!=' ')
            {
                g=g+b;
            }
            else
            {
                System.out.println(g);
                g="";
            }
        }
    }
}
