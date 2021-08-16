package com.company.arrays;

import java.util.Scanner;

public class store_non_duplicate_Values {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int i, a, b, c,x,y;
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
        }
        int[] q = new int[b];
        for (x = 0; x < b; x++) {
            System.out.print("Enter numbers 2nd times " + (x + 1) + " :");
            q[x] = n.nextInt();
        }
        for(i=0;i<a;i++)
        {
            y=0;
            if(p[i]!=q[x])
            {
                y=1;
                i++;
            }
        }
        for (i = 0; i < c; i++) {
            System.out.println(s[i]);
        }
    }
}
