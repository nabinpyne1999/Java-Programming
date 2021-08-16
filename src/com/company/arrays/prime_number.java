package com.company.arrays;
import java.util.*;
public class prime_number {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int i, a, q,j,k,x=0;
        System.out.print("Enter the size: ");
        a = n.nextInt();
        int[] p = new int[a];
        for (i = 0; i < a; i++) {
            System.out.print("Enter numbers " + (i + 1) + " :");
            p[i] = n.nextInt();
        }
        for(k=0;k<a;k++) {
            q=0;
            for (j = 2; j < p[k]; j++) {
                if (p[k] % j == 0) {
                    q = 1;
                    x++;
                }
            }
            if (q == 0) {
                System.out.println(p[k] + " is a prime number");
            }
        }
        if(x==0) {
            System.out.println("There is no prime number");
        }
    }
}


