package com.company.arrays;
import java.util.*;
public class frequency_number {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int i, s = 0,x=0,m,c,j;
        System.out.print("Enter the size: ");
        m = n.nextInt();
        int[] f = new int[m];
        for (i = 0; i < m; i++) {
            System.out.print("Enter numbers: ");
            f[i] = n.nextInt();
        }
        c=1;
        for (j = 0; j < m; j++) {
            if (f[i] ==f[j]) {
                c++;
            }
        }
        System.out.println(f[j]+ " the number= "+c);
        System.out.println(x);
    }
}