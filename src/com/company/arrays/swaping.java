package com.company.arrays;

import java.util.Scanner;

public class swaping {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int i,j,a,b=0,f=0;
        System.out.print("Enter the size: ");
        a = n.nextInt();
        int s[] = new int[a];
        for (i = 0; i < a; i++) {
            System.out.print("Enter numbers: ");
            s[i] = n.nextInt();
        }

        for (j = 0; j<a; j++)
        {
            b=s[0];
            s[0]=s[a-1];
            s[a-1]=b;
        }
        System.out.println(b);
    }
}

