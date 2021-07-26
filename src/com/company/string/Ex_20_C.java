package com.company.string;

import java.util.Scanner;

public class Ex_20_C {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int a, b, p, k = 1;
        String st;
        char q;
        System.out.print("Enter your word to print a pattern: ");
        st = n.nextLine();
        b = st.length();
        for (a = 0; a < b; a++) {
            for (p = a; p < b; p++) {
                q = st.charAt(p);
                System.out.print(q);
            }
            System.out.println();
        }
    }
}
