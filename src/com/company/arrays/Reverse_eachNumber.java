package com.company.arrays;
import java.util.*;
public class Reverse_eachNumber {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int i, a,rev,d;
        System.out.print("Enter the size: ");
        a = n.nextInt();
        int[] r = new int[a];
        for (i = 0; i < a; i++) {
            System.out.print("Enter numbers: ");
            r[i] = n.nextInt();
        }
        for (i = 0; i < a; i++)
        {
            rev=0;
            while (r[i]!=0)
            {
                d=r[i]%10;
                r[i]=r[i]/10;
                rev=rev*10+d;
            }
            System.out.println(rev);
        }
    }
}
