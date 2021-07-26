package com.company.string;
import  java.util.*;
public class Ex_7 {
    public static void main(String[] args) {
        {
            int i,b;
            char ch;
            String p,q;
            Scanner n = new Scanner(System.in);
            System.out.print("Enter a string in uppercase:");
            p = n.nextLine();
            q = "";
            b = p.length();
            n.close();
            for ( i = 0; i < b; i++) {
                ch = p.charAt(i);
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    q = q + '*';
                }
                else {
                    q= q + ch;
                }
            }
            System.out.println(q);
        }
    }
}

