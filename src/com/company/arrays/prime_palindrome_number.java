package com.company.arrays;
import java.util.*;
public class prime_palindrome_number {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int i, a, q, j, k, x = 0,rev,d,h;
        System.out.print("Enter the size: ");
        a = n.nextInt();
        int[] p = new int[a];
        for (i = 0; i < a; i++) {
            System.out.print("Enter numbers " + (i + 1) + " :");
            p[i] = n.nextInt();
        }
        for (k = 0; k < a; k++) {
            q = 0;
            for (j = 2; j < p[k]; j++) {
                if (p[k] % j == 0) {
                    q = 1;
                }
            }
            if (q == 0) {
                rev = 0;
                h = p[k];
                while (p[k] != 0) {
                    d = p[k] % 10;
                    p[k] = p[k] / 10;
                    rev = rev * 10 + d;
                }
                if (h == rev) {
                    x++;
                    System.out.println(rev + " is a prime palindrome number");
                }
            }
        }
        if (x == 0) {
            System.out.println("There is no prime palindrome number");
        }
    }
}
