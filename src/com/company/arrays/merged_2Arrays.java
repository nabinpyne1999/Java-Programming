package com.company.arrays;
import java.util.Scanner;
public class merged_2Arrays {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int i, a, b, c,x;
        System.out.print("Enter the size: ");
        a = n.nextInt();
        int[] p = new int[a];
        System.out.print("Enter the size 2nd times: ");
        b = n.nextInt();
        c = a + b;
        int[] s = new int[c];
        for (i = 0; i < a; i++) {
            System.out.print("Enter numbers " + (i + 1) + " :");
            p[i] = n.nextInt();
            s[i] = p[i];
        }
        int[] q = new int[b];
        for (x = 0; x < b; x++) {
            System.out.print("Enter numbers 2nd times " + (x + 1) + " :");
            q[x] = n.nextInt();
            s[i] = q[x];
            i++;
        }
        for (i = 0; i < c; i++) {
            System.out.println(s[i]);
        }
    }
}
