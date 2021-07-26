package com.company.string;

import java.util.*;

public class Ex_20_A {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int a, b, p;
        String st;
        char q;
        System.out.print("Enter your word to print a pattern: ");
        st = n.nextLine();
        b = st.length();
        for (a = b - 1; a >= 0; a--) {
            for (p = 0; p <= a; p++) {
                q = st.charAt(p);
                System.out.print(q);
            }
            System.out.println();
        }
    }
}

