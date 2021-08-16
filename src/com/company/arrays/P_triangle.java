package com.company.arrays;
import java.util.*;
public class P_triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i,num,n ;
        System.out.println("Enter the size of the Pattern: ");
        n=s.nextInt();
        for  (i = 0; i < n; i++) {
            num = 1;
            System.out.printf("%" + (n - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", num);
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}


