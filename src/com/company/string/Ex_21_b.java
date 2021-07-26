package com.company.string;

public class Ex_21_b {
    public static void main(String[] args) {
        int a,b;
        char st = 'A';

        for ( a = 0; a < 5; a++) {
            for (b = 0; b <= a; b++) {
                System.out.print(st);
                st++;
            }
            System.out.println();
        }
    }
}
