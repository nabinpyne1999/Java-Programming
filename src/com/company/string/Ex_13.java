package com.company.string;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, m, n, y = 0;
        String st, d = "";
        char p, q;
        System.out.print("Enter a string: ");
        st = s.nextLine();
        st = st.trim();
        st = "" + st + "";
        st = st.toUpperCase();
        a = st.length();
        s.close();
        for (b = 0; b < a; b++) {
            p = st.charAt(b);

            if ((st.charAt(b) == 'A') || (st.charAt(b) == 'E') || (st.charAt(b) == 'I') || (st.charAt(b) == 'O') || (st.charAt(b) == 'U'))
            {
                q = (char)(p + 1);
                d = d + q;
            }
            else
            {
                d=d+p;
            }
        }
        System.out.println(d);
    }
}
